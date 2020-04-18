package com.twu.biblioteca.services;

import com.twu.biblioteca.BibliotecaApp;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ConsoleDisplayerTest {
	@Test
	public void shouldDisplayMessages() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);
		String expectedMessage = "This message should be printed!";

		ConsoleDisplayer.displayMessage(expectedMessage);

		verify(printStreamMock).println(expectedMessage);
	}
}