package com.cmcglobal.demo.api.entity;

import javax.persistence.Entity;

@Entity
public class DigitalBook extends BookType {
    private String screenSize;

    public DigitalBook() {}

    public DigitalBook(String name, String screenSize) {
        super(name);
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
