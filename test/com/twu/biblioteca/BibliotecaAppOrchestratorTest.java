package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
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
}