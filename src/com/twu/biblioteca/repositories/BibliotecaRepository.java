package com.twu.biblioteca.repositories;

import com.twu.biblioteca.factories.BibliotecaFactory;
import com.twu.biblioteca.models.Biblioteca;

public class BibliotecaRepository {
	private static Biblioteca biblioteca;
	private static BibliotecaFactory bibliotecaFactory = new BibliotecaFactory();

	public Biblioteca findOrCreate() {
		if (biblioteca == null) {
			biblioteca = bibliotecaFactory.create();
		}
		return biblioteca;
	}

	public static void setBibliotecaFactory(BibliotecaFactory newFactory) {
		bibliotecaFactory = newFactory;
	}

	public static BibliotecaFactory getBibliotecaFactory() {
		return bibliotecaFactory;
	}
}
