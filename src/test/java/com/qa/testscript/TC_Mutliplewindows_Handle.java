package com.qa.testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Mutliplewindows_Handle extends TestBase {

	@Test
	public void windowHadle() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(5000);
		CreateAccountOR.get_Privacy_Link().click();
		Thread.sleep(3000);
		CreateAccountOR.get_Terms_Link().click();
		Thread.sleep(3000);

		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window id is "+parent);
		Set<String> allWindows = driver.getWindowHandles();
		int count=allWindows.size();
		System.out.println("The total windows "+count);
		
		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println("The child window title is "+driver.getTitle());
				Thread.sleep(5000);
				
				driver.close();
			}
			
			driver.switchTo().window(parent);
			System.out.println("Parent window title is "+driver.getTitle());
			
		}
	}
}
