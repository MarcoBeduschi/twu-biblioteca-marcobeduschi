package com.twu.biblioteca.factories;

import com.twu.biblioteca.models.menus.mainMenu.MainMenu;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.ListBookMenuOption;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.MenuOption;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.QuitApplicationMenuOption;
import com.twu.biblioteca.repositories.BibliotecaRepository;

import java.util.Arrays;
import java.util.List;

public class MainMenuFactory {
	public MainMenu create() {
		return new MainMenu(createOptions());
	}

	private List<MenuOption> createOptions() {
		return Arrays.asList(
				new ListBookMenuOption(new BibliotecaRepository()),
				new QuitApplicationMenuOption()
		);
	}
}
