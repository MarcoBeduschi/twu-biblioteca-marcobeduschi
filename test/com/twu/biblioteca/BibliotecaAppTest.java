package com.twu.biblioteca;

import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class BibliotecaAppTest {

	@Test
	public void shouldGetUserInput() {
		String mockInput = "Any String will do!";
		ByteArrayInputStream in = new ByteArrayInputStream(mockInput.getBytes());
		System.setIn(in);

		String actualInput = BibliotecaApp.getUserInput();

		assertThat(actualInput,is(equalTo(mockInput)));
	}

	@Test
	public void shouldHaveASetterFieldTerminatingApp() {
		Boolean initialValue = BibliotecaApp.shouldTerminateApp();

		BibliotecaApp.terminateApp();
		Boolean finalValue = BibliotecaApp.shouldTerminateApp();

		assertThat(finalValue, is(not(initialValue)));
	}

	@After
	public void tearDown() {
		BibliotecaApp.revertTerminateApp();
	}
}