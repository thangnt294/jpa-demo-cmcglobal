package com.cmcglobal.demo.api.others;

import com.cmcglobal.demo.api.entity.Book;

import javax.persistence.*;

public class MyEntityListener {
    @PrePersist
    void onPrePersist(Book book) {
        System.out.println("MyEntityListener.onPrePersist(): " + book);
    }

    @PostPersist
    void onPostPersist(Book book) {
        System.out.println("MyEntityListener.onPostPersist(): " + book);
    }

    @PostLoad
    void onPostLoad(Book book) {
        System.out.println("MyEntityListener.onPostLoad(): " + book);
    }

    @PreUpdate
    void onPreUpdate(Book book) {
        System.out.println("MyEntityListener.onPreUpdate(): " + book);
    }

    @PostUpdate
    void onPostUpdate(Book book) {
        System.out.println("MyEntityListener.onPostUpdate(): " + book);
    }

    @PreRemove
    void onPreRemove(Book book) {
        System.out.println("MyEntityListener.onPreRemove(): " + book);
    }

    @PostRemove
    void onPostRemove(Book book) {
        System.out.println("MyEntityListener.onPostRemove(): " + book);
    }
}
