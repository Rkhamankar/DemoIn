package com.exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionEx {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		// for frame (no such element )
		Thread.sleep(3000);
		//WebElement ab= driver.findElement(By.id("singleframe"));
		//driver.switchTo().frame(ab);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abtakBachhan");
       // driver.findElement(By.partialLinkText("Single Iframe ")).click();
//		
		//it is for frame
		//try
//		{
//		driver.switchTo().window("66e12ffb8d4817fe7633560ad325a8f8");
//		}
//		catch(Exception e)
//		{
//			System.out.println("the window is not found :- "+e);
//		}
		
		
//		try
//		{
//			driver.switchTo().alert().accept();
//		}
//		catch(NoAlertPresentException e)
//		{
//			System.out.println("the alert is not found :- "+e);
//		}
//		
//		System.out.println("ja bhau ja");
		
		
		//for frame
//		try
//		
//		{
//			driver.switchTo().frame(100);
//		}
//		catch(NoSuchFrameException e)
//		{
//			System.out.println("the frame is not found :- "+e);
//		}
		
		
		//staleElement reference exception
		
		//String url =driver.getCurrentUrl();
		
		//System.out.println(url);
		
		
		WebElement elem;
		try
		{
			 elem=driver.findElement(By.partialLinkText("Single "));
			driver.navigate().refresh();
			
			elem.click();
		}
		catch (Exception e) {
			 elem=driver.findElement(By.partialLinkText("Single "));
				
				elem.click();
		}
		
		System.out.println("jamal bhau");
		
		
	}

}
