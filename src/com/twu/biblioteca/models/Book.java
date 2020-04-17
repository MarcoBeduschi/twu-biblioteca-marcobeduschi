package com.twu.biblioteca.models;

import com.twu.biblioteca.repositories.BookRepository;

import java.util.List;

public class Book {
	public final String title;
	public final String author;
	public final int yearPublished;

	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
	}

	public String info()  {
		return String.format("%s, %s, %d", title, author, yearPublished);
	}

	public static List<Book> getAllBooks() {
		return BookRepository.getAllBooks();
	}
}
