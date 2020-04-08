package com.twu.biblioteca;

import com.twu.biblioteca.models.Book;

public class BibliotecaCatalogFactory {
    public static BibliotecaCatalog build() {
        return new BibliotecaCatalog(
            new Book[] {
                new Book("Myth Of Sisyphus", "Albert Camus", 1942),
                new Book("Sophie's World", "Joseph Gaardner", 1992),
                new Book("Harry Potter", "J.K. Rolling", 1992)
            }
        );
    }
}
