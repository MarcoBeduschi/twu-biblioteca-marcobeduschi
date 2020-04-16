package com.twu.biblioteca.models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {

	@Test
	public void shouldHaveATitle() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954);

		String actualTitle = book.title;

		assertThat(actualTitle, is(equalTo("The Lord Of The Rings")));
	}

	@Test
	public void shouldHaveAnAuthor() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954);

		String actualAuthor = book.author;

		assertThat(actualAuthor, is(equalTo("J. R. R. Tolkien")));
	}

	@Test
	public void shouldHaveAnYearPublished() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954);

		int actualYearPublished = book.yearPublished;

		assertThat(actualYearPublished, is(equalTo(1954)));
	}

	@Test
	public void shouldReturnBookInfoFormatted() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954);

		String actualInfo = book.info();

		assertThat(actualInfo, is(equalTo("The Lord Of The Rings, J. R. R. Tolkien, 1954")));
	}
}