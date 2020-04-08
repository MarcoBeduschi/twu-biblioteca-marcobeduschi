package com.twu.biblioteca.models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void shouldHaveATitle() {
        // Given
        Book book = new Book("The Two Towers", "Tolkien", 1990);
        String expectedBookTitle = "The Two Towers";

        String actualBookTitle = book.title;

        assertThat(actualBookTitle, is(equalTo(expectedBookTitle)));
    }

    @Test
    public void shouldHaveAnAuthor() {
        // Given
        Book book = new Book("The Two Towers", "Tolkien", 1990);
        String expectedAuthor = "Tolkien";

        String actualAuthor = book.author;

        assertThat(actualAuthor, is(equalTo(expectedAuthor)));
    }

    @Test
    public void shouldHaveAnYearPublished() {
        // Given
        Book book = new Book("The Two Towers", "Tolkien", 1990);
        int expectedYearPublished = 1990;

        int actualYearPublished = book.yearPublished;

        assertThat(actualYearPublished, is(equalTo(expectedYearPublished)));
    }
}