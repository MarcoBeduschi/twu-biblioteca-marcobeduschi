package com.twu.biblioteca.models.menus.checkoutBookMenu.menuOptions;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.MenuOption;
import com.twu.biblioteca.services.ConsoleDisplayer;

public class CheckoutSingleBookMenuOption implements MenuOption {
	public static final String SUCCESS_MESSAGE = "Thank you! Enjoy the book";
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
		ConsoleDisplayer.displayMessage(SUCCESS_MESSAGE);
	}
}
