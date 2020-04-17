package com.twu.biblioteca;

import com.twu.biblioteca.factories.BibliotecaFactory;
import com.twu.biblioteca.models.Biblioteca;
import com.twu.biblioteca.models.MainMenu;

import java.util.Scanner;


public class BibliotecaApp {

	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		Biblioteca biblioteca = BibliotecaFactory.create();

		run(biblioteca, menu);
	}

	public static void run(Biblioteca biblioteca, MainMenu menu) {
		displayMessage(biblioteca.getWelcomeMessage());
		menu.getOptions().forEach(BibliotecaApp::displayMessage);
	}

	public static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	public static void displayMessage(String message) {
		System.out.println(message);
	}
}
