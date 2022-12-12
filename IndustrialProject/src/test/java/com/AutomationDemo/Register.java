package com.AutomationDemo;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.excel.ReadExcelData;

public class Register {
	public WebDriver driver = null;
	@Test
	public void registerUsered() throws Exception
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().deleteAllCookies();
		
		String fname = ReadExcelData.readExcelSheet("Register.xlsx", "Sheet1", 1, 0);
		String lname = ReadExcelData.readExcelSheet("Register.xlsx", "Sheet1", 1, 1);
		String add = ReadExcelData.readExcelSheet("Register.xlsx", "Sheet1", 2, 0);
		String email = ReadExcelData.readExcelSheet("Register.xlsx", "Sheet1", 3, 0);
		String mobile = ReadExcelData.readExcelSheet("Register.xlsx", "Sheet1", 4, 0);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(add);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(mobile);
		
		/*List<WebElement> option=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (WebElement webElement : option) {
			String radio=webElement.getText();
			
			if(radio.equalsIgnoreCase("Male"))
			{
				driver.findElement(By.xpath("//label[text()=' Male ']")).isSelected();
				break;
				}
			
		}*/
		
		driver.findElement(By.xpath("//label[text()=' Male ']")).click();
		
		
		


	}

}
