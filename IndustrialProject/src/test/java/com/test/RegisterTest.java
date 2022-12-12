package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobject.RegisterPage;

public class RegisterTest {
	public WebDriver driver = null;
	RegisterPage rp = null;
	
	@BeforeMethod
	public void beforeMethod()
	{
        driver = new ChromeDriver();
       
        rp= new RegisterPage(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void RunCode() throws Exception
	{
		rp.toRegisterOnAutomationSite();
	}

}
