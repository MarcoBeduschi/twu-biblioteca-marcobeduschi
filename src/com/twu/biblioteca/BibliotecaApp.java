package com.twu.biblioteca;

import com.twu.biblioteca.factories.MainMenuFactory;
import com.twu.biblioteca.models.Biblioteca;
import com.twu.biblioteca.models.menus.mainMenu.MainMenu;
import com.twu.biblioteca.repositories.BibliotecaRepository;
import com.twu.biblioteca.services.ConsoleDisplayer;

import java.util.Scanner;


public class BibliotecaApp {
	private static Boolean running = true;

	public static void main(String[] args) {
		BibliotecaRepository bibliotecaRepository = new BibliotecaRepository();
		MainMenu menu = new MainMenuFactory().create();
		Biblioteca biblioteca = bibliotecaRepository.findOrCreate();

		run(biblioteca, menu);
	}

	public static void run(Biblioteca biblioteca, MainMenu menu) {
		ConsoleDisplayer.displayMessage(biblioteca.getWelcomeMessage());
		while (!shouldTerminateApp()) {
			runMainMenu(menu);
		}
	}

	public static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static Boolean shouldTerminateApp() {
		return !running;
	}

	public static void terminateApp() {
		running = false;
	}

	public static void revertTerminateApp() {
		running = true;
	}

	private static void runMainMenu(MainMenu menu) {
		menu.getOptions().forEach(ConsoleDisplayer::displayMessage);
		menu.executeOption(getUserInput());
	}
}
