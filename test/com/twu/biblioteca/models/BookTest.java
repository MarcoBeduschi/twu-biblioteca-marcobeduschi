package com.twu.biblioteca.models;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {

	@Test
	public void shouldHaveATitle() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, true);

		String actualTitle = book.title;

		assertThat(actualTitle, is(equalTo("The Lord Of The Rings")));
	}

	@Test
	public void shouldHaveAnAuthor() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, true);

		String actualAuthor = book.author;

		assertThat(actualAuthor, is(equalTo("J. R. R. Tolkien")));
	}

	@Test
	public void shouldHaveAnYearPublished() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, true);

		int actualYearPublished = book.yearPublished;

		assertThat(actualYearPublished, is(equalTo(1954)));
	}

	@Test
	public void shouldReturnBookInfoFormatted() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, true);

		String actualInfo = book.info();

		assertThat(actualInfo, is(equalTo("The Lord Of The Rings, J. R. R. Tolkien, 1954")));
	}

	@Test
	public void shouldHaveAnInStockBooleanOption() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, false);

		Boolean inStock = book.getInStock();

		assertThat(inStock, is(equalTo(false)));
	}

	@Test
	public void shouldChangeInStockToFalseWhenBookIsCheckedOut() {
		Book book = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 1954, true);

		book.checkOut();

		assertThat(book.getInStock(), is(equalTo(false)));
	}

	@Test
	public void shouldFilterBooksNotInStock() {
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

		List<Book> filteredBooks = Book.filterByInStock(allBooks);

		assertThat(filteredBooks, is(equalTo(booksInStock)));
	}
}