package com.twu.biblioteca.views;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ViewRouterTest {
	@Test
	public void shouldRouteToGivenViewNotStatic() {
		View view = mock(View.class);
		ViewRouter router = new ViewRouter();

		router.route(view);

		verify(view).render();
	}
}