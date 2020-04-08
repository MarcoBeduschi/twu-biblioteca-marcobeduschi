package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppOrchestratorTest {
    @Test
    public void shouldPrintWelcomeMessage() {
        // Given
        PrintStream printStream = mock(PrintStream.class);

        // When
        BibliotecaAppOrchestrator.run(printStream);

        // Then
        verify(printStream).println("Welcome to the Library!");
    }

    @Test
    public void shouldPrintListOfBooks() {
        // Given
        PrintStream printStream = mock(PrintStream.class);

        // When
        BibliotecaAppOrchestrator.run(printStream);

        // Then
        verify(printStream).println("Book 1: Myth Of Sisyphus, Albert Camus, 1942.");
        verify(printStream).println("Book 2: Sophie's World, Joseph Gaardner, 1992.");
        verify(printStream).println("Book 3: Harry Potter, J.K. Rolling, 1992.");
    }
}