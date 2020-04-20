package com.twu.biblioteca.factories;

import com.twu.biblioteca.models.menus.Menu;
import com.twu.biblioteca.models.menus.checkoutBookMenu.menuOptions.CheckoutSingleBookMenuOption;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.CheckoutBookMenuOption;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.ListBookMenuOption;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.MenuOption;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.QuitApplicationMenuOption;
import com.twu.biblioteca.repositories.BibliotecaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainMenuFactory {
	public Menu create() {
		return new Menu(createOptions());
	}

	private List<MenuOption> createOptions() {
		return Arrays.asList(
				new ListBookMenuOption(new BibliotecaRepository()),
				new CheckoutBookMenuOption(createCheckoutBookMenu()),
				new QuitApplicationMenuOption()
		);
	}

	private Menu createCheckoutBookMenu() {
		return new Menu(
				new BibliotecaRepository().findOrCreate().getBooks().stream().map(CheckoutSingleBookMenuOption::new).collect(Collectors.toList())
		);
	}
}
