package com.twu.biblioteca.models;

import com.twu.biblioteca.services.BookService;

import java.util.Arrays;
import java.util.List;

public class MainMenu {
	enum Options {
		LIST_BOOKS
	}

	public List<String> getOptions() {
		return Arrays.asList(
				"Main Menu:",
				"1. List Books"
		);
	}

	public void getOption(Enum<Options> operation) {
		if (operation.equals(Options.LIST_BOOKS)) {
			BookService.listBooks();
		}
	}
}
