package com.cmcglobal.demo.api.entity;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
