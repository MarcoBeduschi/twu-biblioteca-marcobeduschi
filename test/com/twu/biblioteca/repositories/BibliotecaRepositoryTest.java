package com.twu.biblioteca.repositories;

import com.twu.biblioteca.factories.BibliotecaFactory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class BibliotecaRepositoryTest {

	@Test
	public void shouldHaveBibliotecaFactoryGetterAndSetter() {
		BibliotecaFactory factoryMock = mock(BibliotecaFactory.class);

		BibliotecaRepository.setBibliotecaFactory(factoryMock);
		BibliotecaFactory actualFactory = BibliotecaRepository.getBibliotecaFactory();

		assertThat(actualFactory, is(equalTo(factoryMock)));
	}
}