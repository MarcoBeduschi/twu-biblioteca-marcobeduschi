package com.twu.biblioteca.views;

import com.twu.biblioteca.services.BookService;

import java.util.List;

public class BookListView implements View {
	public BookService bookService;
	private final ViewRouter router;

	public BookListView(ViewRouter router) {
		bookService = new BookService();
		this.router = router;
	}

	public void render() {
		printBookList();
		router.route(new MainMenuView(router));
	}

	private void printBookList() {
		List<String> books = bookService.getBooksList();
		books.forEach(System.out::println);
	}
}
