package com.twu.biblioteca.models.menus.mainMenu.menuOptions;

import com.twu.biblioteca.repositories.BibliotecaRepository;
import com.twu.biblioteca.services.ConsoleDisplayer;

public class ListBookMenuOption implements MenuOption {
	public static final String OPTION_NAME = "List of Books";
	private final BibliotecaRepository bibliotecaRepository;

	public ListBookMenuOption(BibliotecaRepository bibliotecaRepository) {
		this.bibliotecaRepository = bibliotecaRepository;
	}

	@Override
	public String getName() {
		return OPTION_NAME;
	}

	@Override
	public void execute() {
		bibliotecaRepository.findOrCreate().listBooks().forEach(ConsoleDisplayer::displayMessage);
	}
}
