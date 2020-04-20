package com.twu.biblioteca.models.menus.mainMenu;

import com.twu.biblioteca.models.Biblioteca;
import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.menus.mainMenu.menuOptions.ListBookMenuOption;
import com.twu.biblioteca.repositories.BibliotecaRepository;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ListBookMenuOptionTest {
	@Test
	public void shouldHaveAName() {
		ListBookMenuOption menuOption = new ListBookMenuOption(null);

		String actualName = menuOption.getName();

		assertThat(actualName, is(equalTo("List of Books")));
	}

	@Test
	public void shouldListBooksWhenExecuted() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);

		Book book1 = new Book("Barney The Dinosaur", "Someone", 150, true);
		Book book2 = new Book("A Batalha do Apocalipse", "Eduardo Spohr", 2010, true);
		List<Book> books = Arrays.asList(
				book1,
				book2
		);
		Biblioteca biblioteca = new Biblioteca(books);
		BibliotecaRepository repositoryMock = mock(BibliotecaRepository.class);
		doReturn(biblioteca).when(repositoryMock).findOrCreate();
		ListBookMenuOption menuOption = new ListBookMenuOption(repositoryMock);

		menuOption.execute();

		verify(printStreamMock).println(biblioteca.listBooks().get(0));
		verify(printStreamMock).println(biblioteca.listBooks().get(1));
	}
}