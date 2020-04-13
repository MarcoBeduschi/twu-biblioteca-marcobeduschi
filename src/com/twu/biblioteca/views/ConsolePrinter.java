package com.twu.biblioteca.views;

import com.twu.biblioteca.BibliotecaCatalog;
import com.twu.biblioteca.models.Book;

import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsolePrinter {
		private PrintStream printStream;
		
		public ConsolePrinter(PrintStream printStream) {
				this.printStream = printStream;
		}
		
		public void displayMainMenu() {
				printStream.println("Main Menu:");
				printStream.println("1. Display Book List");
		}
		
		public void displayBookList() {
				printStream.println("Books available:");
				getBooksList().forEach(printStream::println);
		}
		
		private List<String> getBooksList() {
				return IntStream.range(0, BibliotecaCatalog.getBOOKS().size())
								.mapToObj(index -> {
										int bookNum = index + 1;
										Book currBook = BibliotecaCatalog.getBOOKS().get(index);
										
										return "Book " + bookNum + ": " + currBook.formatBook();
								})
								.collect(Collectors.toList());
		}
		
}
