package com.twu.biblioteca.models;

import com.twu.biblioteca.services.BookService;

import java.util.List;
import java.util.stream.Collectors;

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
		return BookService.listBooks(getBooksInStock());
	}

	public List<Book> getBooksInStock() {
		return books.stream().filter(Book::getInStock).collect(Collectors.toList());
	}
}
