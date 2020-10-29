//package com.cmcglobal.demo.api.serviceImpl;
//
//import com.cmcglobal.demo.api.dto.BookCategoryDto;
//import com.cmcglobal.demo.api.dto.BookDto;
//import com.cmcglobal.demo.api.entity.Book;
//import com.cmcglobal.demo.api.entity.BookCategory;
//import com.cmcglobal.demo.api.info.BookInfo;
//import com.cmcglobal.demo.api.repository.BookCategoryRepository;
//import com.cmcglobal.demo.api.service.BookCategoryService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//
//@Service
//public class BookCategoryServiceImpl implements BookCategoryService {
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @Autowired
//    private BookCategoryRepository bookCategoryRepository;
//
//    @Override
//    public BookCategoryDto createBookCategory(BookCategoryDto bookCategoryDto) {
//        BookCategory bookCategory = new BookCategory();
//
//        bookCategory.setName(bookCategoryDto.getName());
//
//        Set<Book> books = new HashSet<>();
//        if (bookCategoryDto.getBooks() != null && !bookCategoryDto.getBooks().isEmpty()){
//            for (BookInfo bookInfo : bookCategoryDto.getBooks()) {
//                books.add(modelMapper.map(bookInfo, Book.class));
//            }
//        }
//
//        bookCategory.setBooks(books);
//        return modelMapper.map(bookCategoryRepository.save(bookCategory), BookCategoryDto.class);
//    }
//
//    @Override
//    public BookCategoryDto updateBookCategory(Integer bookCategoryID, BookCategoryDto bookCategoryDto) {
//        if (bookCategoryID != null) {
//            BookCategory bookCategory = bookCategoryRepository.getOne(bookCategoryID);
//            if (bookCategory != null) {
//
//                bookCategory.setName(bookCategoryDto.getName());
//
//                Set<Book> books = new HashSet<>();
//                if (bookCategoryDto.getBooks() != null && !bookCategoryDto.getBooks().isEmpty()){
//                    for (BookInfo bookInfo : bookCategoryDto.getBooks()) {
//                        books.add(modelMapper.map(bookInfo, Book.class));
//                    }
//                }
//                bookCategory.setBooks(books);
//                return modelMapper.map(bookCategoryRepository.save(bookCategory), BookCategoryDto.class);
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<BookCategoryDto> getBookCategories() {
//        List<BookCategory> bookCategories = bookCategoryRepository.findAll();
//        List<BookCategoryDto> bookCategoryDtos = new ArrayList<>();
//        if (bookCategories != null && !bookCategories.isEmpty()) {
//            for (BookCategory bookCategory : bookCategories) {
//                bookCategoryDtos.add(modelMapper.map(bookCategory, BookCategoryDto.class));
//            }
//        }
//        return bookCategoryDtos;
//    }
//
//    @Override
//    public BookCategoryDto getBookCategory(Integer bookCategoryID) {
//        Optional<BookCategory> bookCategoryOptional = bookCategoryRepository.findById(bookCategoryID);
//        if (bookCategoryOptional.isPresent()) {
//            return modelMapper.map(bookCategoryOptional.get(), BookCategoryDto.class);
//        }
//        return null;
//    }
//
//    @Override
//    public boolean deleteBookCategory(Integer bookCategoryID) {
//        try {
//            bookCategoryRepository.deleteById(bookCategoryID);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//}
