package com.twu.biblioteca.services;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.repositories.BookRepository;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookServiceTest {
	@Test
	public void shouldListAllBooks() {
		List<Book> books = Arrays.asList(
				new Book("The Olympians", "Rick Riordan", 2006),
				new Book("Friday 13th", "No Clue", 1980)
		);

		List<String> bookList = BookService.listBooks(books);

		assertThat(bookList, is(equalTo(Arrays.asList(
				"Book 1: " + books.get(0).info(),
				"Book 2: " + books.get(1).info()
		))));
	}
}