package com.twu.biblioteca.repositories;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookRepositoryTest {
	@Test
	public void shouldReturnAllBooks() {
		List<String> actualBooks = BookRepository.getAllBooks();

		List<String> expectedBooks = BookRepository.BOOKS;

		assertThat(actualBooks, is(equalTo(expectedBooks)));
	}
}