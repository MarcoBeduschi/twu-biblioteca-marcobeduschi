package com.twu.biblioteca.models.menus.checkoutBookMenu.menuOptions;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.MenuOption;
import com.twu.biblioteca.services.ConsoleDisplayer;

public class CheckoutSingleBookMenuOption implements MenuOption {
	public static final String SUCCESS_MESSAGE = "Thank you! Enjoy the book";
	public static final String UNSUCCESSFUL_MESSAGE = "Sorry, that book is not available";
	private final Book book;

	public CheckoutSingleBookMenuOption(Book book) {
		this.book = book;
	}

	@Override
	public String getName() {
		return book.getTitle();
	}

	@Override
	public void execute() {
		if(book.checkOut()) {
			ConsoleDisplayer.displayMessage(SUCCESS_MESSAGE);
		} else {
			ConsoleDisplayer.displayMessage(UNSUCCESSFUL_MESSAGE);
		}
	}
}
