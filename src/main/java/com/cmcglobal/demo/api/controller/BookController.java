package com.cmcglobal.demo.api.controller;

import com.cmcglobal.demo.api.entity.Book;
import com.cmcglobal.demo.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/book")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book result = bookService.createBook(book);
        return new ResponseEntity<Book>(result, result != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping(value = "/update/{bookID}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer bookID, @RequestBody Book Book) {
        Book result = bookService.updateBook(bookID, Book);
        return new ResponseEntity<Book>(result, result != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> result = bookService.getBooks();
        return new ResponseEntity<>(result, !result.isEmpty() ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping(value = "/get/{bookID}")
    public ResponseEntity<Book> getBook(@PathVariable Integer bookID) {
        Book result = bookService.getBook(bookID);
        return new ResponseEntity<>(result, result != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping(value = "/delete/{bookID}")
    public ResponseEntity<Boolean> deleteBook(@PathVariable Integer bookID) {
        Boolean result = bookService.deleteBook(bookID);
        return new ResponseEntity<>(result, result ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

