package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.combinationPOMAndPageFactory.CombinationClass;


public class CombinationTest {
	
    WebDriver driver = null;
	CombinationClass cc = null;
	
	@BeforeMethod
	public void beforeMethod()
	{
        driver = new ChromeDriver();
       
        cc= new CombinationClass(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void RunCode() throws Exception
	{
		cc.toRegisterOnAutomationSite();
	}

}
