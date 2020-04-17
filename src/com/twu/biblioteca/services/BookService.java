package com.twu.biblioteca.services;

import com.twu.biblioteca.models.Book;

import java.util.List;
import java.util.stream.IntStream;

public class BookService {
	public static List<String> listBooks(List<Book> books) {
		List<String> bookList = new java.util.ArrayList<>();

		IntStream.range(0, books.size()).forEach(index -> {
			int bookNum = index + 1;
			Book currBook = books.get(index);

			bookList.add("Book " + bookNum + ": " + currBook.info());
		});

		return bookList;
	}
}
