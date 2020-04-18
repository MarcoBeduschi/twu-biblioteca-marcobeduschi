package com.twu.biblioteca.models;

import com.twu.biblioteca.repositories.BibliotecaRepository;
import com.twu.biblioteca.services.ConsoleDisplayer;

import java.util.Arrays;
import java.util.List;

public class MainMenu {
	public static final String INVALID_OPTION = "Invalid Option.. Please try again.";
	public static final String MAIN_MENU_HEADER_MESSAGE = "Main Menu:";

	public List<String> getOptions() {
		return Arrays.asList(
				MAIN_MENU_HEADER_MESSAGE,
				"1. List Books"
		);
	}

	public void executeOption(String option) {
		if (option.equals("1")) {
			BibliotecaRepository.findOrCreate().listBooks().forEach(ConsoleDisplayer::displayMessage);
		}

		ConsoleDisplayer.displayMessage(INVALID_OPTION);
	}
}
