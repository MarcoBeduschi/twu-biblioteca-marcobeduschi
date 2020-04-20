package com.twu.biblioteca.models.menus.mainMenu.menuOptions;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.models.menus.Menu;
import com.twu.biblioteca.services.ConsoleDisplayer;

public class CheckoutBookMenuOption implements MenuOption {
	private final Menu menu;

	public CheckoutBookMenuOption(Menu checkoutBookMenu) {
		this.menu = checkoutBookMenu;
	}

	@Override
	public String getName() {
		return "Checkout Book";
	}

	@Override
	public void execute() {
		menu.getOptions().forEach(ConsoleDisplayer::displayMessage);
		menu.executeOption(BibliotecaApp.getUserInput());
	}
}
