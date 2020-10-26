package com.cmcglobal.demo.api.service;

import com.cmcglobal.demo.api.dto.BookDto;

public interface BookService {
    void createBook(BookDto book);
    void updateBook(Integer bookID, BookDto book);
    void getBooks();
    void deleteBook(Integer bookID);
}
