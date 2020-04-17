package com.twu.biblioteca.services;

import com.twu.biblioteca.models.Book;

import java.util.List;
import java.util.stream.IntStream;

public class BookService {
	public static void listBooks() {
		System.out.println("Available Books:");
		List<Book> books = Book.getAllBooks();

		IntStream.range(0, books.size()).forEach(index -> {
			int bookNum = index + 1;
			Book currBook = books.get(index);

			System.out.println("Book " + bookNum + ": " + currBook.info());
		});
	}
}
