package com.twu.biblioteca.models.menus.mainMenu;

import com.twu.biblioteca.models.menus.mainMenu.menuOptions.MenuOption;
import com.twu.biblioteca.services.ConsoleDisplayer;

import java.util.List;
import java.util.stream.Collectors;

public class MainMenu {
	public static final String INVALID_OPTION = "Please select a valid option!";
	private final List<MenuOption> options;

	public MainMenu(List<MenuOption> options) {
		this.options = options;
	}

	public List<String> getOptions() {
		return options.stream().map(MenuOption::getName).collect(Collectors.toList());
	}

	public void executeOption(String optionName) {
		MenuOption selectedOption = options.stream().filter(option -> option.getName().equals(optionName)).findFirst().orElse(null);

		if (selectedOption == null) {
			ConsoleDisplayer.displayMessage(INVALID_OPTION);
		} else {
			selectedOption.execute();
		}
	}
}
