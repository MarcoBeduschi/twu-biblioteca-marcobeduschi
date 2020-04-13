package com.twu.biblioteca;

import com.twu.biblioteca.views.ConsolePrinter;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ConsolePrinterTest {
    @Test
    public void shouldDisplayMainMenu() {
        PrintStream printStream = mock(PrintStream.class);
        ConsolePrinter printer = new ConsolePrinter(printStream);

        printer.displayMainMenu();

        verify(printStream).println("Main Menu:");
        verify(printStream).println("1. Display Book List");
    }

    @Test
    public void shouldDisplayBookList() {
        PrintStream printStream = mock(PrintStream.class);
        ConsolePrinter printer = new ConsolePrinter(printStream);

        printer.displayBookList();

        verify(printStream).println("Books available:");
        verify(printStream).println("Book 1: Myth Of Sisyphus, Albert Camus, 1942.");
        verify(printStream).println("Book 2: Sophie's World, Joseph Gaardner, 1992.");
        verify(printStream).println("Book 3: Harry Potter, J.K. Rolling, 1992.");
    }
}
