package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BibliotecaCatalogFactoryTest {
    @Test
    public void shouldReturnANewBibliotecaCatalog() {
        // Given
        BibliotecaCatalog catalog = BibliotecaCatalogFactory.build();

        assertThat(catalog.getClass(), is(equalTo(BibliotecaCatalog.class)));
    }

    @Test
    public void shouldReturnACatalogWithBooks() {
        BibliotecaCatalog catalog = BibliotecaCatalogFactory.build();
    }

}