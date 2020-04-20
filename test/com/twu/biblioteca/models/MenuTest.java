package com.twu.biblioteca.models;

import com.twu.biblioteca.models.menus.mainMenu.menuOptions.ListBookMenuOption;
import com.twu.biblioteca.models.menus.Menu;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.MenuOption;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class MenuTest {
	@Test
	public void shouldDisplayAllOptionsNames() {
		MenuOption option1 = mock(ListBookMenuOption.class);
		doReturn("Option 1").when(option1).getName();
		MenuOption option2 = mock(ListBookMenuOption.class);
		doReturn("Option 2").when(option2).getName();
		Menu menu = new Menu(Arrays.asList(option1, option2));

		List<String> options = menu.getOptions();

		assertThat(options, is(equalTo(Arrays.asList("Option 1", "Option 2"))));
	}

	@Test
	public void shouldExecuteOptionBasedOnOptionName() {
		MenuOption option1 = mock(ListBookMenuOption.class);
		doReturn("Option 1").when(option1).getName();
		Menu menu = new Menu(Collections.singletonList(option1));

		menu.executeOption("Option 1");

		verify(option1).execute();
	}

	@Test
	public void shouldDisplayInvalidOptionIfOptionNotFound() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);
		MenuOption option1 = mock(ListBookMenuOption.class);
		doReturn("Option 1").when(option1).getName();
		Menu menu = new Menu(Collections.singletonList(option1));

		menu.executeOption("Invalid Option");

		verify(printStreamMock).println(Menu.INVALID_OPTION);
	}
}