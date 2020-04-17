package com.twu.biblioteca;

import com.twu.biblioteca.models.Biblioteca;
import com.twu.biblioteca.models.MainMenu;

import java.util.List;
import java.util.Scanner;


public class BibliotecaApp {

	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		Biblioteca biblioteca = new Biblioteca(menu);

		run(biblioteca);
	}

	public static void run(Biblioteca biblioteca) {
		displayMessage(biblioteca.getWelcomeMessage());
		biblioteca.getMainMenu().getOptions().forEach(BibliotecaApp::displayMessage);
		String userInput = getUserInput();
//		menu.displayOptions();
//		BookService.listBooks();
	}

	public static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	private static String welcomeUser() {
		return "Welcome to the Biblioteca!";
	}

	public static void displayMessage(String message) {
		System.out.println(message);
	}
}
