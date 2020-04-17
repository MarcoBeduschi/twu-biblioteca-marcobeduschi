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
	@Before
	public void setUp() {
		String input = "1";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	}

	@Test
	public void shouldReturnAListOfOptionsToBeDisplayed() {
		MainMenu menu = new MainMenu();
		List<String> expectedOptions = Arrays.asList("Main Menu:", "1. List Books");

		List<String> actualOptions = menu.getOptions();

		assertThat(actualOptions, is(equalTo(expectedOptions)));
	}
}