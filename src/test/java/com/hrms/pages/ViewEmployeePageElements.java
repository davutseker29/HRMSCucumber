package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.BaseClass;

public class ViewEmployeePageElements {
	
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//table[@id= 'resultTable']")
	public WebElement employeesTable;
	
	@FindBy (xpath="//table[@id= 'resultTable']//tbody/tr/td[3]")
	public List<WebElement> tableFirstName;
	
	@FindBy (xpath="//tr[@class='odd']/td[2]/a")
	public List<WebElement> tableID;
	
	/**
	 * this method will check if employees table is displayed
	 * @return
	 */

	public boolean isTableDisplayed(){
		return employeesTable.isDisplayed();
	}
	
	public List<Map<String, String>> getIDFromTable() {
		List<Map<String, String>> uiID = new ArrayList<>();
		for (WebElement row : tableID) {
			Map<String, String> storeUiIDs = new LinkedHashMap<>();
			String tableID = row.getText();
			storeUiIDs.put("emp_IDs", tableID);
			uiID.add(storeUiIDs);
		}
		return uiID;
	}
	
	
	
	public List<Map<String, String>> getFirstNameFromTable() {
		List<Map<String, String>> uiName = new ArrayList<>();
		for (WebElement row : tableFirstName) {
			Map<String, String> storeUiNames = new LinkedHashMap<>();
			String tableName = row.getText();
			storeUiNames.put("emp_firstname", tableName);
			uiName.add(storeUiNames);
		}
		return uiName;
	}
	
	@FindBy(xpath= "//label[text()='Employment Status']")
	public WebElement pageTitle;

	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
