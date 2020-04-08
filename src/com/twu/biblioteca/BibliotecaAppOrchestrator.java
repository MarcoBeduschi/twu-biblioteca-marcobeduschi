package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;

import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BibliotecaAppOrchestrator {
    public static void run(PrintStream printStream) {

        printStream.println("Welcome to the Library!");
        printStream.println("");
        printStream.println("Books available:");
        getBooksList().forEach(printStream::println);
        printStream.println("");
    }

    public static List<String> getBooksList() {
        BibliotecaCatalog catalog = BibliotecaCatalogFactory.build();

        return IntStream.range(0, catalog.books.length)
                .mapToObj(index -> {
                    int bookNum = index + 1;
                    Book currBook = catalog.books[index];

                    return String.format("Book %d: %s, %s, %d.", bookNum, currBook.title, currBook.author, currBook.yearPublished);
                })
                .collect(Collectors.toList());
    }
}
