package com.twu.biblioteca.services;

import com.twu.biblioteca.repositories.BookRepository;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookServiceTest {
	@Test
	public void shouldListAllBooks() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);

		BookService.listBooks();

		verify(printStreamMock).println("Available Books:");
		verify(printStreamMock).println("Book 1: " + BookRepository.BOOKS.get(0).info());
		verify(printStreamMock).println("Book 2: " + BookRepository.BOOKS.get(1).info());
		verify(printStreamMock).println("Book 3: " + BookRepository.BOOKS.get(2).info());
	}
}