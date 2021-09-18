package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {

	@Given("user is logged in with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

		@Given("user is navigated to employee list page")
	public void user_is_navigated_to_employee_list_page() {
		jsClick(dashboard.PIM);
	}

	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String empID) {

		sendText(viewEmp.empID, empID);

	}

	@When("click on search button")
	public void click_on_search_button() {

	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
		System.out.println("Employee is displayed");

	}

	@When("user enters valid employee {string}")
	public void user_enters_valid_employee_name_and_last_name(String name) {
		sendText(viewEmp.empName,name );

	}

}
