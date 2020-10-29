//package com.cmcglobal.demo.api.controller;
//
//import com.cmcglobal.demo.api.dto.BookCategoryDto;
//import com.cmcglobal.demo.api.service.BookCategoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/api/bookCategory")
//public class BookCategoryController {
//
//    @Autowired
//    private BookCategoryService bookCategoryService;
//
//    @PostMapping(value = "/create")
//    public ResponseEntity<BookCategoryDto> createBook(@RequestBody BookCategoryDto bookCategoryDto) {
//        BookCategoryDto result = bookCategoryService.createBookCategory(bookCategoryDto);
//        return new ResponseEntity<BookCategoryDto>(result, result != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @PostMapping(value = "/update/{bookCategoryID}")
//    public ResponseEntity<BookCategoryDto> updateBook(@PathVariable Integer bookCategoryID, @RequestBody BookCategoryDto bookCategoryDto) {
//        BookCategoryDto result = bookCategoryService.updateBookCategory(bookCategoryID, bookCategoryDto);
//        return new ResponseEntity<BookCategoryDto>(result, result != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @GetMapping(value = "/getAll")
//    public ResponseEntity<List<BookCategoryDto>> getBooks() {
//        List<BookCategoryDto> result = bookCategoryService.getBookCategories();
//        return new ResponseEntity<>(result, !result.isEmpty() ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @GetMapping(value = "/get/{bookCategoryID}")
//    public ResponseEntity<BookCategoryDto> getBook(@PathVariable Integer bookCategoryID) {
//        BookCategoryDto result = bookCategoryService.getBookCategory(bookCategoryID);
//        return new ResponseEntity<>(result, result != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @DeleteMapping(value = "/delete/{bookCategoryID}")
//    public ResponseEntity<Boolean> deleteBook(@PathVariable Integer bookCategoryID) {
//        Boolean result = bookCategoryService.deleteBookCategory(bookCategoryID);
//        return new ResponseEntity<>(result, result ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}
