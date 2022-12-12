package com.combinationPOMAndPageFactory;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pageutils.PageUtility;
import com.pageutils.ReadExcel;

public class CombinationClass {
	
     WebDriver driver = null;
	
	public CombinationClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//by using pom concept
	 By fN=By.xpath("//input[@placeholder='First Name']");
	
	 By lN=By.xpath("//input[@placeholder='Last Name']");
	
	//for pagefactory
	
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
	
	public void toRegisterOnAutomationSite() throws Exception
	{
	    String fName = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 1, 0);
		String lname = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 1, 1);
		String add = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 2, 0);
		String email = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 3, 0);
		String mob = ReadExcel.readExcelSheet("Register.xlsx", "Sheet1", 4, 0);
		
		//use here pom element
		WebElement fn=driver.findElement(fN);
		WebElement ln=driver.findElement(lN);
		PageUtility.sendKeys(fn, fName);
		PageUtility.sendKeys(ln, lname);
		
		//use here page factory element
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
		
		System.out.println(checkB);
		
		System.out.println(driver.getTitle());
	}

}
