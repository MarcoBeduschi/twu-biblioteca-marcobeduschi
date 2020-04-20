package com.twu.biblioteca.factories;

import com.twu.biblioteca.models.Biblioteca;
import com.twu.biblioteca.models.Book;

import java.util.Arrays;
import java.util.List;


public class BibliotecaFactory {
	public Biblioteca create() {
		return new Biblioteca(createBooks());
	}

	private List<Book> createBooks() {
		return Arrays.asList(
				new Book("The Myth of Sisyphus", "Albert Camus", 1952, true),
				new Book("Sofie's World", "Joseph Gaardner", 2000, true),
				new Book("Harry Potter and The Sorcerer's Stone", "J. K. Rolling", 2000, true)
		);
	}
}
