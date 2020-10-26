package com.cmcglobal.demo.api.dto;

import java.util.HashSet;
import java.util.Set;

public class BookCategoryDto {
    private int id;

    private String name;

    private Set<BookDto> books;

    public BookCategoryDto(){
        books = new HashSet<>();
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

    public Set<BookDto> getBooks() {
        return books;
    }

    public void setBooks(Set<BookDto> books) {
        this.books = books;
    }
}
