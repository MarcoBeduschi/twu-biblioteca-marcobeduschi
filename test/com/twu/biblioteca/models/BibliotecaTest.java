package com.twu.biblioteca.models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class BibliotecaTest {
	@Test
	public void shouldDisplayWelcomeMessage() {
		Biblioteca biblioteca = new Biblioteca(new MainMenu());
		String expectedMessage = "Welcome to the Biblioteca!";

		String actualMessage = biblioteca.getWelcomeMessage();

		assertThat(actualMessage, is(equalTo(expectedMessage)));
	}

	@Test
	public void shouldHaveAMainMenu() {
		MainMenu menuMock = mock(MainMenu.class);
		Biblioteca biblioteca = new Biblioteca(menuMock);

		MainMenu actualMenu = biblioteca.getMainMenu();

		assertThat(actualMenu, is(equalTo(menuMock)));
	}
}