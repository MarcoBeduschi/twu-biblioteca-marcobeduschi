package com.twu.biblioteca.models;

import com.twu.biblioteca.models.menus.mainMenu.menuOptions.ListBookMenuOption;
import com.twu.biblioteca.models.menus.MainMenu;
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

public class MainMenuTest {
	@Test
	public void shouldDisplayAllOptionsNames() {
		MenuOption option1 = mock(ListBookMenuOption.class);
		doReturn("Option 1").when(option1).getName();
		MenuOption option2 = mock(ListBookMenuOption.class);
		doReturn("Option 2").when(option2).getName();
		MainMenu menu = new MainMenu(Arrays.asList(option1, option2));

		List<String> options = menu.getOptions();

		assertThat(options, is(equalTo(Arrays.asList("Option 1", "Option 2"))));
	}

	@Test
	public void shouldExecuteOptionBasedOnOptionName() {
		MenuOption option1 = mock(ListBookMenuOption.class);
		doReturn("Option 1").when(option1).getName();
		MainMenu menu = new MainMenu(Collections.singletonList(option1));

		menu.executeOption("Option 1");

		verify(option1).execute();
	}

	@Test
	public void shouldDisplayInvalidOptionIfOptionNotFound() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);
		MenuOption option1 = mock(ListBookMenuOption.class);
		doReturn("Option 1").when(option1).getName();
		MainMenu menu = new MainMenu(Collections.singletonList(option1));

		menu.executeOption("Invalid Option");

		verify(printStreamMock).println(MainMenu.INVALID_OPTION);
	}
}