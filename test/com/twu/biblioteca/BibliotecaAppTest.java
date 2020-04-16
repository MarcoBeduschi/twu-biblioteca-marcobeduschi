package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {
		
		@Test
		public void shouldPrintAWelcomeMessage() {
				PrintStream printStreamMock = mock(PrintStream.class);
				System.setOut(printStreamMock);
				
				BibliotecaApp.run();
				
				verify(printStreamMock).println("Welcome to the Biblioteca!");
		}
		
		public void shouldListAllBooks() {
		
		}
}