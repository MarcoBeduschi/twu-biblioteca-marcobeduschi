package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

	@Test
	public void shouldGetUserInput() {
		String mockInput = "Any String will do!";
		ByteArrayInputStream in = new ByteArrayInputStream(mockInput.getBytes());
		System.setIn(in);

		String actualInput = BibliotecaApp.getUserInput();

		assertThat(actualInput,is(equalTo(mockInput)));
	}
}