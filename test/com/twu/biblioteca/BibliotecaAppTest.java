package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

	@Test
	public void shouldPrintAWelcomeMessage() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);

		BibliotecaApp.run();

		verify(printStreamMock).println("Welcome to the Biblioteca!");
	}

	@Test
	public void shouldListAllBooks() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);

		BibliotecaApp.run();

		verify(printStreamMock).println("Book 1: Harry Potter");
		verify(printStreamMock).println("Book 2: Percy Jackson");
		verify(printStreamMock).println("Book 3: The Myth of Sisyphus");
	}
}