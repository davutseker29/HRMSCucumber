package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.When;

public class AddEmployeeHWSteps extends CommonMethods {
	
	@When("user enters employees {string}, {string} and {string}")
	public void user_enters_employees_and(String firstname, String middlename, String lastname) {
	   sendText(addEmp.firstName, firstname);
	   sendText(addEmp.middleName, middlename);
	   sendText(addEmp.lastName, lastname);
	   
		
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		sendText(addEmp.username, username);
		   sendText(addEmp.password, password);
		   sendText(addEmp.confirmPassword, password);
		   
		   selectDdValue(addEmp.status, 1);


}}
