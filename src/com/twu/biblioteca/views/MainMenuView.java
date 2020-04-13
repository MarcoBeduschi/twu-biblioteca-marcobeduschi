package com.twu.biblioteca.views;

import java.util.Scanner;

public class MainMenuView implements View {
	private final ViewRouter router;

	public MainMenuView(ViewRouter router) {
		this.router = router;
	}

	public void render() {
		printMainMenuOptions();
		getNextAction();
	}

	private void getNextAction() {
		String input = new Scanner(System.in).nextLine();

		if (input.equals("1")) {
			router.route(new BookListView(router));
		}
	}

	private void printMainMenuOptions() {
		System.out.println("Main Menu:");
		System.out.println("1. List Books");
	}
}
