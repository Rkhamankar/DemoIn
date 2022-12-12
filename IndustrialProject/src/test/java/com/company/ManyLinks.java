package com.company;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManyLinks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//div[@role='presentation'][@class='footer-links']//ul[1]
		
		driver.manage().window().maximize();
		
	   driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21c%21&gclid=Cj0KCQiA4aacBhCUARIsAI55maEfd5qdjhKj8ueIakIctDFEAUuE93RY2DdakHphK9CiJusFuGLwx_AaAi4PEALw_wcB");
	   driver.manage().deleteAllCookies();
	   
	   driver.findElement(By.xpath("//p[@class='sc-17gtelb-81 bIYRTA']")).click();
	   
	  List<WebElement> list =driver.findElements(By.xpath("//div[@role='presentation'][@class='footer-links']//ul[1]"));
	  
	  for(WebElement ele:list)
	  {
		  ele.click();
	  }
	
	}

}
