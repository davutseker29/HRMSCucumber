package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmpPersonalDetailsSteps extends CommonMethods {
	
	@Given("user is logged in with valid admin credentials")
	public void user_is_logged_in_with_valid_admin_credentials() {
		
		login.login("username", "password");
	   
	}
	@Given("user is navigated to employee list page")
	public void user_is_navigated_to_employee_list_page() {
	   
		dashboard.PIM.click();
	}
	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String empID) {
		
		sendText(viewEmp.empID, empID);
	   
	}
	@When("click on search button")
	public void click_on_search_button() {
		
		jsClick(viewEmp.searchBtn);
	   
	}
	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	   
		boolean isDisplayed=viewEmp.isTableDisplayed();
		Assert.assertTrue(isDisplayed);
	}

}
