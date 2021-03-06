package com.cmcglobal.demo.api.entity;

import javax.persistence.Entity;

@Entity
public class PaperBook extends BookType{
    private double coverPrice;

    public PaperBook() {}

    public PaperBook(String name, double coverPrice) {
        super(name);
        this.coverPrice = coverPrice;
    }

    public double getCoverPrice() {
        return coverPrice;
    }

    public void setCoverPrice(double coverPrice) {
        this.coverPrice = coverPrice;
    }
}
