package com.twu.biblioteca.repositories;

import com.twu.biblioteca.models.Book;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
	public static final List<Book> BOOKS = Arrays.asList(
			new Book("Harry Potter", "J. K. Rowling", 1992),
			new Book("Percy Jackson", "Rick Riordan", 2005),
			new Book("The Myth of Sisyphus", "Albert Camus", 1952)
	);

	public static List<Book> getAllBooks() {
		return BOOKS;
	}
}
