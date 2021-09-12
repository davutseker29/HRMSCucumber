package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("user enter valid admin username and password")
	public void user_enter_valid_admin_username_and_password() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
		String expected = "Welcome Admin";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
		wait(2);
		tearDown();
	}

	@When("user enter valid ess username and password")
	public void user_enter_valid_ess_username_and_password() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
		String expected = "Welcome Admin";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		wait(2);
		tearDown();
	}

	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "aa");
		click(login.loginBtn);
	}

	@Then("User see Invalid Credentials text on login page")
	public void user_see_invalid_credentials_text_on_login_page() {
		String actual = login.errorMsg.getText();
		String expected = "Invalid credentials";
		Assert.assertEquals(actual, expected);
		tearDown();
	}
	
	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	   login.login(username, password); 
	}
	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String firstName) {
	   String actual=dashboard.welcome.getText();
	   Assert.assertEquals(actual,firstName);
	}
	
	@When("user enters invalid username and password and see error message")
	public void user_enters_invalid_username_and_password_and_see_error_message(DataTable invalidCredentials) {
		List<Map<String, String>> list = invalidCredentials.asMaps();
		for (Map<String, String> map : list) {
			sendText(login.username, map.get("UserName"));
			sendText(login.password, map.get("Password"));
			click(login.loginBtn);

			Assert.assertEquals("Not correct error message is displayed", map.get("ErrorMessage"),
					login.errorMsg.getText());

		}
	}
	}


