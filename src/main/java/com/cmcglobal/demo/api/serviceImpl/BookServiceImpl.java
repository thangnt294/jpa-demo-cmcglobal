package com.cmcglobal.demo.api.serviceImpl;

import com.cmcglobal.demo.api.entity.*;
import com.cmcglobal.demo.api.repository.*;
import com.cmcglobal.demo.api.service.BookService;
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
//    @Transactional
    public Book createBook(Book book) {
        Set<Chapter> chapters = new HashSet<>(book.getChapters());
        Set<Author> authors = new HashSet<>(book.getAuthors());
        publisherRepository.save(book.getPublisher());
        categoryRepository.save(book.getCategory());
        chapterRepository.saveAll(chapters);
        authorRepository.saveAll(authors);

        //        entity.setName("NEW NAME");
        return bookRepository.save(book);
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
        return bookRepository.save(entity);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Integer bookID) {
        Optional<Book> bookOptional = bookRepository.findById(bookID);
        return bookOptional.orElse(null);
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
