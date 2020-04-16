package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.repositories.BookRepository;

import java.util.List;
import java.util.stream.IntStream;

public class BibliotecaApp {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		welcomeUser();
		listBooks();
	}

	private static void welcomeUser() {
		System.out.println("Welcome to the Biblioteca!");
	}

	private static void listBooks() {
		List<Book> books = BookRepository.getAllBooks();

		IntStream.range(0, books.size()).forEach(index -> {
			int bookNum = index + 1;
			Book currBook = books.get(index);

			System.out.println("Book " + bookNum + ": " + currBook.info());
		});
	}
}
