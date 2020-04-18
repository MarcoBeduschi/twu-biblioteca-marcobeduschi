package com.twu.biblioteca;

import com.twu.biblioteca.models.Biblioteca;
import com.twu.biblioteca.models.MainMenu;
import com.twu.biblioteca.repositories.BibliotecaRepository;
import com.twu.biblioteca.services.ConsoleDisplayer;

import java.util.Scanner;


public class BibliotecaApp {

	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		Biblioteca biblioteca = BibliotecaRepository.findOrCreate();

		run(biblioteca, menu);
	}

	public static void run(Biblioteca biblioteca, MainMenu menu) {
		ConsoleDisplayer.displayMessage(biblioteca.getWelcomeMessage());
		while (true) {
			menu.getOptions().forEach(ConsoleDisplayer::displayMessage);
			menu.executeOption(getUserInput());
		}
	}

	public static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
