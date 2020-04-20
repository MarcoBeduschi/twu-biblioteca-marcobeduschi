package com.twu.biblioteca.models.menus.mainMenu.menuOptions;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.models.menus.Menu;
import com.twu.biblioteca.models.menus.checkoutBookMenu.menuOptions.CheckoutSingleBookMenuOption;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CheckoutBookMenuOptionTest {
	private Menu menu;
	private CheckoutBookMenuOption menuOption;
	private PrintStream printStreamMock;
	private String mockInput;

	@Before
	public void setUp() {
		// Mock User Input
		mockInput = "Any String will do!";
		ByteArrayInputStream in = new ByteArrayInputStream(mockInput.getBytes());
		System.setIn(in);
		// Mock System.out
		printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);

		menu = mock(Menu.class);
		menuOption = new CheckoutBookMenuOption(menu);
	}

	@Test
	public void shouldHaveAName() {
		String actualName = menuOption.getName();

		assertThat(actualName, is(equalTo("Checkout Book")));
	}

	@Test
	public void shouldDisplayMenuOptionsWhenExecuted() {
		List<String> options = Arrays.asList(
				"Option A",
				"Option B"
		);
		doReturn(options).when(menu).getOptions();

		menuOption.execute();

		verify(printStreamMock).println("Option A");
		verify(printStreamMock).println("Option B");
	}

	@Test
	public void shouldTryToExecuteOptionBasedOnUserInput() {
		menuOption.execute();

		verify(menu).executeOption(mockInput);
	}
}