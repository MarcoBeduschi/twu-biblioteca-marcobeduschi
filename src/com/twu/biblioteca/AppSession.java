package com.twu.biblioteca;

import com.twu.biblioteca.views.ViewRouter;
import com.twu.biblioteca.views.WelcomeUserView;


public class AppSession {
	private ViewRouter router = new ViewRouter();

    public void start() {
    	router.route(new WelcomeUserView(router));
    }
}
