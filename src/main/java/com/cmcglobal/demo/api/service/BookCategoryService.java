package com.cmcglobal.demo.api.service;

import com.cmcglobal.demo.api.dto.BookCategoryDto;

import java.util.List;

public interface BookCategoryService {
    BookCategoryDto createBookCategory(BookCategoryDto bookCategoryDto);
    BookCategoryDto updateBookCategory(Integer bookCategoryID, BookCategoryDto bookCategoryDto);
    List<BookCategoryDto> getBookCategories();
    BookCategoryDto getBookCategory(Integer bookCategoryID);
    boolean deleteBookCategory(Integer bookCategoryID);
}
