package com.objectRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterObjectRepo {
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement fName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement lName;
	
	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	public WebElement address;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement emailId;
	
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement mobileNo;
	
	@FindBy(xpath = "//input[@type='radio']")
	public List<WebElement> radioButton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	public List<WebElement> checkBox;
	
//	@FindBy(tagName =  "multi-select")
//	public WebElement langs;
	@FindBy(xpath = "//select[@id='Skills']")
	public WebElement skills;//dropdown
	
	@FindBy(xpath = "//select[@id='countries']")
	public WebElement country;
	
	@FindBy(xpath = "//select[@id='yearbox']")
	public WebElement year;
	
	@FindBy(xpath = "//select[@placeholder='Month']")
	public WebElement month;
	
	@FindBy(xpath = "//select[@id='daybox']")
	public WebElement day;
	
	
	
	
	

}
