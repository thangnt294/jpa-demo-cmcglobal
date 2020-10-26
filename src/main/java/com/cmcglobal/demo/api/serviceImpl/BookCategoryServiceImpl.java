package com.cmcglobal.demo.api.serviceImpl;

import com.cmcglobal.demo.api.dto.BookCategoryDto;
import com.cmcglobal.demo.api.service.BookCategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BookCategoryServiceImpl implements BookCategoryService {
    @Autowired
    private ModelMapper modelmapper;

    @Override
    public void createBookCategory(BookCategoryDto bookCategoryDto) {

    }

    @Override
    public void updateBookCategory(Integer bookCategoryID, BookCategoryDto bookCategoryDto) {

    }

    @Override
    public void getBookCategories() {

    }

    @Override
    public void deleteBookCategory(Integer bookCategoryID) {

    }
}
