package com.twu.biblioteca.models;

import com.twu.biblioteca.services.BookService;

import java.util.List;

public class Biblioteca {
	private final List<Book> books;

	public Biblioteca(List<Book> books) {
		this.books = books;
	}

	public String getWelcomeMessage() {
		return "Welcome to the Biblioteca!";
	}

	public List<Book> getBooks() {
		return books;
	}

	public List<String> listBooks() {
		return BookService.listBooks(getBooks());
	}
}
