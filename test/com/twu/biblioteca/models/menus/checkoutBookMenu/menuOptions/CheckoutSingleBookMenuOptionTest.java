package com.twu.biblioteca.models.menus.checkoutBookMenu.menuOptions;

import com.twu.biblioteca.models.Book;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CheckoutSingleBookMenuOptionTest {
	@Test
	public void shouldBookTitleAsName() {
		Book bookMock = mock(Book.class);
		CheckoutSingleBookMenuOption menuOption = new CheckoutSingleBookMenuOption(bookMock);
		doReturn("Book Title").when(bookMock).getTitle();

		String menuOptionName = menuOption.getName();

		assertThat(menuOptionName, is(equalTo(bookMock.title)));
	}

	@Test
	public void shouldCheckoutTargetBookWhenExecuted() {
		Book bookMock = mock(Book.class);
		CheckoutSingleBookMenuOption menuOption = new CheckoutSingleBookMenuOption(bookMock);

		menuOption.execute();

		verify(bookMock).checkOut();
	}

	@Test
	public void shouldDisplayAMessageWhenExecuted() {
		PrintStream printStreamMock = mock(PrintStream.class);
		System.setOut(printStreamMock);
		Book bookMock = mock(Book.class);
		CheckoutSingleBookMenuOption menuOption = new CheckoutSingleBookMenuOption(bookMock);

		menuOption.execute();

		verify(printStreamMock).println("Thank you! Enjoy the book");
	}
}