package com.twu.biblioteca.models;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class BibliotecaTest {
	@Test
	public void shouldDisplayWelcomeMessage() {
		Biblioteca biblioteca = new Biblioteca(null);
		String expectedMessage = "Welcome to the Biblioteca!";

		String actualMessage = biblioteca.getWelcomeMessage();

		assertThat(actualMessage, is(equalTo(expectedMessage)));
	}

	@Test
	public void shouldReturnAListOfBooks() {
		List<Book> expectedBooks = Collections.singletonList(mock(Book.class));
		Biblioteca biblioteca = new Biblioteca(expectedBooks);

		List<Book> actualBooks = biblioteca.getBooks();

		assertThat(actualBooks, is(equalTo(expectedBooks)));
	}

	@Test
	public void shouldHaveAGetterForBooksInStock() {
		List<Book> booksInStock = Arrays.asList(
				new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, true),
				new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, true)
		);
		List<Book> booksNotInStock = Collections.singletonList(
				new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, false)
		);
		List<Book> allBooks = new java.util.ArrayList<>();
		allBooks.addAll(booksInStock);
		allBooks.addAll(booksNotInStock);
		Biblioteca biblioteca = new Biblioteca(allBooks);

		List<Book> filteredBooks = biblioteca.getBooksInStock();

		assertThat(filteredBooks, is(equalTo(booksInStock)));
	}
}