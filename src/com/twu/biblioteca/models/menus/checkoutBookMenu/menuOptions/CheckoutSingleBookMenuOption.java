package com.twu.biblioteca.models.menus.checkoutBookMenu.menuOptions;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.MenuOption;

public class CheckoutSingleBookMenuOption implements MenuOption {
	private final Book book;

	public CheckoutSingleBookMenuOption(Book book) {
		this.book = book;
	}

	@Override
	public String getName() {
		return book.title;
	}

	@Override
	public void execute() {
		book.checkOut();
	}
}
