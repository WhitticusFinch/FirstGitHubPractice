package com.heroku.pageobjects;

import com.automation.base.Base;

public class BasicAuthPage extends Base {

	public void signIn() {

		myLibrary.delay(1);
		myLibrary.gotoWebsite("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		myLibrary.delay(1);

	}

	public CheckboxesPage goToCheckboxesPage() {

		myLibrary.gotoWebsite("https://the-internet.herokuapp.com/checkboxes");
		CheckboxesPage checkboxesPage = new CheckboxesPage();
		return checkboxesPage;

	}

}
