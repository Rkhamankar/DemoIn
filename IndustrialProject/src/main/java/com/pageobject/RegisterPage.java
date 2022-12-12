package com.pageobject;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.objectRepo.RegisterObjectRepo;
import com.pageutils.PageUtility;
import com.pageutils.ReadExcel;

public class RegisterPage extends RegisterObjectRepo {
	
	public WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void toRegisterOnAutomationSite() throws Exception
	{
		String fname = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 1, 0);
		String lname = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 1, 1);
		String add = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 2, 0);
		String email = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 3, 0);
		String mob = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 4, 0);
		
		PageUtility.sendKeys(fName, fname);
		PageUtility.sendKeys(lName, lname);
		PageUtility.sendKeys(address, add);
		PageUtility.sendKeys(emailId, email);
		PageUtility.sendKeys(mobileNo, mob);
		
		PageUtility.radioButton(radioButton, "Male");
		
		ArrayList<String>checkB= new ArrayList<String>();
		checkB.add("Cricket");
		checkB.add("Movies");
		PageUtility.checkBox(checkBox, checkB);
		
		//PageUtility.dropDwon(langs, "English");
		PageUtility.dropDwon(skills, "Oracle");
		//PageUtility.dropDwon(country, "India");
		PageUtility.dropDwon(year, "1996");
		PageUtility.dropDwon(month, "December");
		PageUtility.dropDwon(day, "31");
		
		System.out.println(driver.getTitle());
	}
	
	

}
