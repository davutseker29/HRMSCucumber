package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	

	@Given("user navigates to AddEmployeePage")
	public void user_navigates_to_add_employee_page() {

		dashboard.navigateToAddEmployee();
	}

	@When("user enters employees first name and last name")
	public void user_enters_employees_first_and_last_name() {
		sendText(addEmp.firstName, "bumssba");
		sendText(addEmp.lastName, "bumssba");
	}

	@When("user enters employees {string} and {string}")
	public void user_enters_employees_first_and_last_name(String firstName, String lastName) {
		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		waitForClickability(addEmp.saveBtn);
		jsClick(addEmp.saveBtn);
	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
		String actual = pdetails.profilePic.getText();
		String expected = "bumssba bumssba";
		Assert.assertEquals("they are not equal",expected, actual );

	}

	@Then("{string} is added successfully")
	public void employee_is_added_successfully(String expectedName) {
		String actual = pdetails.profilePic.getText();
		System.err.println(actual+" "+expectedName);
		Assert.assertEquals("they are not equal",expectedName, actual );
		wait(4);
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		addEmp.employeeId.clear();
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		jsClick(addEmp.checkboxLoginDetails);
	}

	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		sendText(addEmp.username, "dembabam123");
		sendText(addEmp.password, "Trabzon123456,,");
		sendText(addEmp.confirmPassword, "Trabzon123456,,");
	}

	@When("user enters employees {string},{string} and {string}")
	public void user_enters_employees_and(String fName, String mName, String lName) {

		sendText(addEmp.firstName, fName);
		sendText(addEmp.middleName, mName);
		sendText(addEmp.lastName, lName);

	}

	@Then("{string},{string} and {string} is added succesfully")
	public void and_is_added_succesfully(String string, String string2, String string3) {
		System.out.println("Employees are added");
	}
	
	@When("user enters employee details and click on save then employee is added")
	public void user_enters_employee_details_and_click_on_save(DataTable dataTable) {
		List<Map<String, String>> addEmpList = dataTable.asMaps();
		for (Map<String, String> map : addEmpList) {
			
			String fname = map.get("FirstName");
			String mname = map.get("MiddleName");
			String lname = map.get("LastName");

			sendText(addEmp.firstName, fname);
			sendText(addEmp.middleName, mname);
			sendText(addEmp.lastName, lname);
			click(addEmp.saveBtn);
			// adding assertion

			String actual = pdetails.profilePic.getText();
			String expected = fname + " " + mname + " " + lname;
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addEmp);
			wait(5);
		}
	}

}
