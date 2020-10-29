package com.cmcglobal.demo.api.dto;

import com.cmcglobal.demo.api.entity.Book;
import com.cmcglobal.demo.api.info.BookCategoryInfo;

public class BookDto {
    private int id;

    private String name;

    private BookCategoryInfo bookCategory;

    public BookDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookCategoryInfo getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategoryInfo bookCategory) {
        this.bookCategory = bookCategory;
    }
}
