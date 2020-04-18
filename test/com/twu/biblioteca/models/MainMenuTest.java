package com.twu.biblioteca.models;

import com.twu.biblioteca.repositories.BookRepository;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {
	@Test
	public void shouldReturnAListOfOptionsToBeDisplayed() {
		MainMenu menu = new MainMenu();
		List<String> expectedOptions = Arrays.asList("Main Menu:", "1. List Books");

		List<String> actualOptions = menu.getOptions();

		assertThat(actualOptions, is(equalTo(expectedOptions)));
	}

	@Test
	public void shouldDisplayBookListWhenRequested() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);
		MainMenu menu = new MainMenu();

		menu.executeOption("1");

		verify(printStreamMock).println("Book 1: The Myth of Sisyphus, Albert Camus, 1952");
		verify(printStreamMock).println("Book 2: Sofie's World, Joseph Gaardner, 2000");
		verify(printStreamMock).println("Book 3: Harry Potter and The Sorcerer's Stone, J. K. Rolling, 2000");
	}

	@Test
	public void shouldDisplayInvalidMessageWhenOptionNotFound() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);
		MainMenu menu = new MainMenu();

		menu.executeOption("INVALID OPTION");

		verify(printStreamMock).println("Invalid Option.. Please try again.");
	}
}