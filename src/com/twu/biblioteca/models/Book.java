package com.twu.biblioteca.models;

public class Book {
	public final String title;
	public final String author;
	public final int yearPublished;
	private boolean inStock;

	public Book(String title, String author, int yearPublished, boolean inStock) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.inStock = inStock;
	}

	public String info()  {
		return String.format("%s, %s, %d", title, author, yearPublished);
	}

	public Boolean getInStock() {
		return inStock;
	}

	public void checkOut() {
		inStock = false;
	}
}
