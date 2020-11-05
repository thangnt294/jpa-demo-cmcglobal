package com.cmcglobal.demo.api.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "book_table")
public class Book {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Embedded
    private Language mainLanguage;

    @ElementCollection
    private Set<Language> otherLanguages;

    @OneToOne
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Chapter> chapters;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Author> authors;

    public Book() {
    }

    public Book(String name) {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Language getLanguage() {
        return mainLanguage;
    }

    public void setLanguage(Language mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public Language getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(Language mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public Set<Language> getOtherLanguages() {
        return otherLanguages;
    }

    public void setOtherLanguages(Set<Language> otherLanguages) {
        this.otherLanguages = otherLanguages;
    }
}
