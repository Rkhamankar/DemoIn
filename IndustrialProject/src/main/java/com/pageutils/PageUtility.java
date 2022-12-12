package com.pageutils;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class PageUtility {
	
	static WebDriver driver;
	
	public PageUtility(WebDriver driver)
	{
		
		PageUtility.driver=driver;
	}
	
	public static void sendKeys(WebElement element, String text)
	{
		
		
		      element.clear();
		      element.sendKeys(text);

	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
	
	public static void radioButton(List<WebElement> radio, String text)
	{
		for (WebElement  element: radio) {
			
			if(element.getAttribute("Value").equals(text))
			{
				element.click();
				break;
			}
			
		}
	}
		
	public static void checkBox(List<WebElement> checkBox, List<String> listText)
	{
			
          for(String text:listText) {
			
			 for (WebElement  element: checkBox){
					
				if(element.getAttribute("Value").equals(text))
				{
					element.click();
					break;
				}
				
				}
				
			}
	}
	
	public static void dropDwon(WebElement element, String text)
	{
		Select select= new Select(element);
		select.selectByVisibleText(text);
		
		List<WebElement> options=select.getOptions();
		
			//for whole dropdownlist
			System.out.println(options.size());
		
	}
	
	public static void driverSwitchTo(String parentWin, Set<String>allWin, String Title)
	{
		parentWin=driver.getWindowHandle();
		allWin=driver.getWindowHandles();
		for(String childWin:allWin)
		{
			if(!childWin.equals(parentWin))
			{
				driver.switchTo().window(childWin);
				if(driver.getTitle().equalsIgnoreCase(Title))
				{
					System.out.println(driver.getTitle());
					driver.close();
				}
			}
		}
	}
	
	
	
	
	
	

	
	

}
