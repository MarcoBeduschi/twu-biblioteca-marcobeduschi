package com.twu.biblioteca.views;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuViewTest {
	private PrintStream printStream;

	@Before
	public void mockSystemOut() {
		printStream = mock(PrintStream.class);
		System.setOut(printStream);
	}

	@Before
	public void mockScanner() {
		String input = "anyInput";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
	}

	@Test
	public void shouldPrintAListOfOptions() {
		ViewRouter router = mock(ViewRouter.class);
		MainMenuView view = new MainMenuView(router);

		view.render();

		verify(printStream).println("Main Menu:");
		verify(printStream).println("1. List Books");
	}

}