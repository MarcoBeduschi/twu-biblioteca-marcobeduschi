package com.twu.biblioteca.views;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WelcomeUserViewTest {
	private PrintStream mockPrintStream;

	@Before
	public void mockPrint() {
		mockPrintStream = mock(PrintStream.class);
		System.setOut(mockPrintStream);
	}

	@Test
	public void shouldPrintAMessageToUser() {
		ViewRouter router = mock(ViewRouter.class);
		WelcomeUserView view = new WelcomeUserView(router);

		view.render();

		verify(mockPrintStream).println("Welcome to the Biblioteca!");
	}

	@Test
	public void shouldRouteToAnotherView() {
		ViewRouter router = mock(ViewRouter.class);
		WelcomeUserView view = new WelcomeUserView(router);

		view.render();

		verify(router).route(any());
	}
}