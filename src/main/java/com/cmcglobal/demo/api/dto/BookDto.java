package com.cmcglobal.demo.api.dto;

public class BookDto {
    private int id;

    private String name;

    private BookCategoryDto bookCategoryDto;

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

    public BookCategoryDto getBookCategoryDto() {
        return bookCategoryDto;
    }

    public void setBookCategoryDto(BookCategoryDto bookCategoryDto) {
        this.bookCategoryDto = bookCategoryDto;
    }
}
