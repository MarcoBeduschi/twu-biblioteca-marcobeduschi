package com.twu.biblioteca.models.menus.mainMenu.menuOptions;

import com.twu.biblioteca.BibliotecaApp;

public class QuitApplicationMenuOption implements MenuOption {
	public static final String OPTION_NAME = "Quit Application";

	@Override
	public String getName() {
		return OPTION_NAME;
	}

	@Override
	public void execute() {
		BibliotecaApp.terminateApp();
	}
}
