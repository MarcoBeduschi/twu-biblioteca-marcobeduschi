package com.twu.biblioteca.models;

public class Book {
    public String title;
    public String author;
    public int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String formatBook()  {
        return String.format("%s, %s, %d.", title, author, yearPublished);
    }
}
