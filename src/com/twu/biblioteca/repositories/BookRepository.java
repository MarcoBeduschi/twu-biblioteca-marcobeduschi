package com.twu.biblioteca.repositories;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
		public static final List<String> BOOKS = Arrays.asList("Harry Potter", "Percy Jackson", "The Myth of Sisyphus");
		
		public static List<String> getAllBooks() {
				return BOOKS;
		}
}
