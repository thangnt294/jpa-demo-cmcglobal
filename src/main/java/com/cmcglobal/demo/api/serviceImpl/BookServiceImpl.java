package com.cmcglobal.demo.api.serviceImpl;

import com.cmcglobal.demo.api.entity.*;
import com.cmcglobal.demo.api.repository.*;
import com.cmcglobal.demo.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    BookTypeRepository bookTypeRepository;

    @Autowired
    PaperBookRepository paperBookRepository;

    public BookServiceImpl(BookRepository bookRepository, PublisherRepository publisherRepository, CategoryRepository categoryRepository, ChapterRepository chapterRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.categoryRepository = categoryRepository;
        this.chapterRepository = chapterRepository;
        this.authorRepository = authorRepository;
    }

    @Override
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
//        entity.setName("NEW NAME");
        return entity;
    }

    @Override
    public Book updateBook(Integer bookID, Book book) {
        Book entity = bookRepository.getOne(bookID);
        entity.setName(book.getName());
        entity.setMainLanguage(book.getLanguage());
        entity.setOtherLanguages(book.getOtherLanguages());
        entity.setCategory(book.getCategory());
        entity.setAuthors(book.getAuthors());
        entity.setChapters(book.getChapters());
        entity.setPublisher(book.getPublisher());
        Book updatedEntity = bookRepository.save(entity);
        return updatedEntity;
    }

    @Override
    public List<Book> getBooks() {
        List<Book> books = bookRepository.findAll();
        return books;
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

}
