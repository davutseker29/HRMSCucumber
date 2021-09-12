package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.BaseClass;
import com.hrms.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {

	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;

	@FindBy(id = "personal_txtEmpFirstName")
	public WebElement firstName;

	@FindBy(id = "btnSave")
	public WebElement editBtn;

	@FindBy(id = "personal_txtEmpLastName")
	public WebElement lastName;

	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;

	@FindBy(id = "personal_txtLicenNo")
	public WebElement driverLicNo;

	@FindBy(id = "personal_txtNICNo")
	public WebElement SSNNo;

	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;

	@FindBy(xpath = "//*[@id=\"profile-pic\"]/h1")
	public WebElement profilePic;

	@FindBy(id = "btnSave")
	public WebElement btnSave;
	
	@FindBy(id= "chkLogin")
	public WebElement chkLogin;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
