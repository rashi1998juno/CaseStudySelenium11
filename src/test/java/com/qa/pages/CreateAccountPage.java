package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

	WebDriver driver;

	// Getting privacy link of Gmail create account
	@FindBy(xpath = "//a[contains(text(),'Privacy')]")
	WebElement Privacylink;
	
	public WebElement get_Privacy_Link()
	{
		return Privacylink;
	}
	

	// Getting terms link of Gmail create account
	@FindBy(xpath = "//a[contains(text(),'Terms')]")
	WebElement Termslink;
	
	public WebElement get_Terms_Link()
	{
		return Termslink;
	}
	

	public CreateAccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);// all the elements of this particular driver is attached

	}
}
