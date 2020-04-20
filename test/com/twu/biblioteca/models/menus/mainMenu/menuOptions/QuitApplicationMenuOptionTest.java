package com.twu.biblioteca.models.menus.mainMenu.menuOptions;

import com.twu.biblioteca.BibliotecaApp;
import org.junit.After;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class QuitApplicationMenuOptionTest {
	@Test
	public void shouldHaveAName() {
		QuitApplicationMenuOption menuOption = new QuitApplicationMenuOption();

		String actualName = menuOption.getName();

		assertThat(actualName, is(equalTo("Quit Application")));
	}

	@Test
	public void shouldQuitApplicationWhenExecuted() {
		QuitApplicationMenuOption menuOption = new QuitApplicationMenuOption();
		Boolean initialQuitValue = BibliotecaApp.shouldTerminateApp();

		menuOption.execute();
		Boolean finalQuitValue = BibliotecaApp.shouldTerminateApp();

		assertThat(finalQuitValue, is(not(initialQuitValue)));
	}

	@After
	public void tearDown() {
		BibliotecaApp.revertTerminateApp();
	}}