package com.cmcglobal.demo.api.service;

import com.cmcglobal.demo.api.dto.BookCategoryDto;
import com.cmcglobal.demo.api.entity.BookCategory;

public interface BookCategoryService {
    void createBookCategory(BookCategoryDto bookCategoryDto);
    void updateBookCategory(Integer bookCategoryID, BookCategoryDto bookCategoryDto);
    void getBookCategories();
    void deleteBookCategory(Integer bookCategoryID);
}
