package com.twu.biblioteca.models.menus.mainMenu.menuOptions;

import com.twu.biblioteca.BibliotecaApp;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class CheckoutBookMenuOptionTest {
	@Test
	public void shouldHaveAName() {
		CheckoutBookMenuOption menuOption = new CheckoutBookMenuOption();

		String actualName = menuOption.getName();

		assertThat(actualName, is(equalTo("Checkout Book")));
	}

	@Test
	public void shouldCheckoutABookWhenExecuted() {
		CheckoutBookMenuOption menuOption = new CheckoutBookMenuOption();
		Boolean initialQuitValue = BibliotecaApp.shouldTerminateApp();

		menuOption.execute();
		Boolean finalQuitValue = BibliotecaApp.shouldTerminateApp();

		assertThat(finalQuitValue, is(not(initialQuitValue)));
	}
}