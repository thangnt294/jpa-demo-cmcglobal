package com.cmcglobal.demo.api.serviceImpl;

import com.cmcglobal.demo.api.entity.Author;
import com.cmcglobal.demo.api.entity.Book;
import com.cmcglobal.demo.api.entity.Category;
import com.cmcglobal.demo.api.entity.Chapter;
import com.cmcglobal.demo.api.repository.*;
import com.cmcglobal.demo.api.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    BookRepository bookRepository;

    PublisherRepository publisherRepository;

    CategoryRepository categoryRepository;

    ChapterRepository chapterRepository;

    AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository, PublisherRepository publisherRepository, CategoryRepository categoryRepository, ChapterRepository chapterRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.categoryRepository = categoryRepository;
        this.chapterRepository = chapterRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    @Transactional
    public Book createBook(Book book) {
        Set<Chapter> chapters = new HashSet<>();
        chapters.addAll(book.getChapters());
        Set<Author> authors = new HashSet<>();
        authors.addAll(book.getAuthors());
        publisherRepository.save(book.getPublisher());
        categoryRepository.save(book.getCategory());
        chapterRepository.saveAll(chapters);
        authorRepository.saveAll(authors);

        Book entity = bookRepository.save(book);
        return entity;
    }

    @Override
    public Book updateBook(Integer bookID, Book book) {
        Book entity = bookRepository.getOne(bookID);
        entity.setName(book.getName());
        entity.setCategory(book.getCategory());
        entity.setAuthors(book.getAuthors());
        entity.setChapters(book.getChapters());
        entity.setPublisher(book.getPublisher());
        Book updatedEntity = bookRepository.save(entity);
        return updatedEntity;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Integer bookID) {
        Optional<Book> bookOptional = bookRepository.findById(bookID);
        if (bookOptional.isPresent()) {
            return bookOptional.get();
        }
        return null;
    }

    @Override
    public boolean deleteBook(Integer bookID) {
        try {
            bookRepository.deleteById(bookID);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

//    @Override
//    public Book createBook(Book book) {
//        Book bookEntity = new Book();
//
//        bookEntity.setName(bookDto.getName());
//        bookEntity.setBookCategory(modelMapper.map(bookDto.getBookCategory(), BookCategory.class));
//        return modelMapper.map(bookRepository.save(bookEntity), BookDto.class);
//    }
//
//    @Override
//    public BookDto updateBook(Integer bookID, BookDto bookDto) {
//        if (bookID != null) {
//            Book bookEntity = bookRepository.getOne(bookID);
//            if (bookEntity != null) {
//                bookEntity.setName(bookDto.getName());
//                bookEntity.setBookCategory(modelMapper.map(bookDto.getBookCategory(), BookCategory.class));
//                return modelMapper.map(bookRepository.save(bookEntity), BookDto.class);
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<BookDto> getBooks() {
//        List<Book> books = bookRepository.findAll();
//        List<BookDto> bookDtos = new ArrayList<>();
//        if (books != null && !books.isEmpty()) {
//            for (Book book : books) {
//                bookDtos.add(modelMapper.map(book, BookDto.class));
//            }
//            return bookDtos;
//        }
//        return null;
//    }
//
//    @Override
//    public BookDto getBook(Integer bookID) {
//        Optional<Book> bookOptional = bookRepository.findById(bookID);
//        if (bookOptional.isPresent()) {
//            Book entity = bookOptional.get();
//            BookDto bookDto = modelMapper.map(entity,BookDto.class);
//            return bookDto;
//        }
//        return null;
//    }
//
//    @Override
//    public boolean deleteBook(Integer bookID) {
//        try {
//            bookRepository.deleteById(bookID);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
}
