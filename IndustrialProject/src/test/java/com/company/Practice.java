package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("file:///C:/Users/Admin/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	
	driver.findElement(By.xpath("//button")).submit();
	
	}

}
