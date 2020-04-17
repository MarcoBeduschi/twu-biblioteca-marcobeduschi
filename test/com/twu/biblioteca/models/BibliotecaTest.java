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
}