package com.twu.biblioteca.views;

public class WelcomeUserView implements View {

	private final ViewRouter router;

	public WelcomeUserView(ViewRouter router) {
		this.router = router;
	}

	public void render() {
		printWelcomeMessage();
		router.route(new MainMenuView(router));
	}

	private void printWelcomeMessage() {
		System.out.println("Welcome to the Biblioteca!");
	}
}
