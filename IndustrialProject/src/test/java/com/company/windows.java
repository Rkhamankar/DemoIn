package com.company;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
	
	
	public static void Windows(String window) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
		
		String parentWin=driver.getWindowHandle();
		
		List<WebElement> more=driver.findElements(By.partialLinkText("More info"));
		
		for (WebElement webElement : more) {
			
			webElement.click();
			
		}
		
		Set<String> allWindow=driver.getWindowHandles();
		
		for(String child: allWindow)
		{
			if(!child.equals(parentWin))
			{
			driver.switchTo().window(child);
			
			if(driver.getTitle().equals("Java By Kiran"))
			{
				System.out.println(driver.getTitle());
				
				driver.close();
				
				Thread.sleep(3000);
				
				break;
			}
		}
			
			driver.switchTo().window(parentWin);
			driver.close();
		}
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Windows("python-syllabus.pdf");
	}

}
