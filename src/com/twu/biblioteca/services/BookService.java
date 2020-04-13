package com.twu.biblioteca.services;

import com.twu.biblioteca.BibliotecaCatalog;
import com.twu.biblioteca.models.Book;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BookService {
		public List<String> getBooksList() {
				return IntStream.range(0, BibliotecaCatalog.getBOOKS().size()).mapToObj(index -> {
						int bookNum = index + 1;
						Book currBook = BibliotecaCatalog.getBOOKS().get(index);
						
						return "Book " + bookNum + ": " + currBook.formatBook();
				}).collect(Collectors.toList());
		}
}
