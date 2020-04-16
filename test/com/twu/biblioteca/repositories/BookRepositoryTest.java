package com.twu.biblioteca.repositories;

import com.twu.biblioteca.models.Book;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookRepositoryTest {
	@Test
	public void shouldReturnAllBooks() {
		List<Book> actualBooks = BookRepository.getAllBooks();

		List<Book> expectedBooks = BookRepository.BOOKS;

		assertThat(actualBooks, is(equalTo(expectedBooks)));
	}
}