package com.cmcglobal.demo.api.service;

import com.cmcglobal.demo.api.dto.BookDto;
import com.cmcglobal.demo.api.entity.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    Book updateBook(Integer bookID, Book book);
    List<Book> getBooks();
    Book getBook(Integer bookID);
    boolean deleteBook(Integer bookID);
}
