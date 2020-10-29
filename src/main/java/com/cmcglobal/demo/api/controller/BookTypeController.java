package com.cmcglobal.demo.api.controller;

import com.cmcglobal.demo.api.entity.Book;
import com.cmcglobal.demo.api.entity.BookType;
import com.cmcglobal.demo.api.entity.DigitalBook;
import com.cmcglobal.demo.api.entity.PaperBook;
import com.cmcglobal.demo.api.service.BookTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/bookType")
public class BookTypeController {
    private BookTypeService bookTypeService;

    public BookTypeController(BookTypeService bookTypeService) {
        this.bookTypeService = bookTypeService;
    }

    @GetMapping(value = "/test")
    public ResponseEntity<String> addBookTypes() {
        bookTypeService.saveBookType(new BookType("book type 1"));
        bookTypeService.saveDigitalBook(new DigitalBook("digital book 1", "large"));
        bookTypeService.savePaperBook((new PaperBook("paper book 1", 9.5)));
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }
}
