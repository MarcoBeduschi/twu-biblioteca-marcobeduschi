package com.twu.biblioteca.models;

public class Biblioteca {
	private final MainMenu menu;

	public Biblioteca(MainMenu menu) {
		this.menu = menu;
	}

	public String getWelcomeMessage() {
		return "Welcome to the Biblioteca!";
	}

	public MainMenu getMainMenu() {
		return menu;
	}
}
