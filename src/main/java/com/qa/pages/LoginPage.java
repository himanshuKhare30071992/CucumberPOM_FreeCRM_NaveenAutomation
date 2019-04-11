package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class LoginPage extends TestBase 
{
	
	//#1 Using Page Factory we will define the page objects using annotation @findBy 
	@FindBy(name="email")
	WebElement userEmail;
	
	@FindBy(name="password")
	WebElement userPassword;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	@FindBy(xpath="//div[@class='onesignal-bell-launcher-button']")
	WebElement bellIcon;

	
	//#2 Initialize the page factory
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//#3 Actions which you want to perform in LoginPage
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}

	public boolean validateBellIcon()
	{
		return bellIcon.isDisplayed();
	}
	
	public HomePage login(String email, String pwd) throws InterruptedException
	{
		TestUtil.flashElement(userEmail);
		userEmail.sendKeys(email);
		
		TestUtil.flashElement(userPassword);
		userPassword.sendKeys(pwd);
		
		TestUtil.flashElement(loginButton);
		loginButton.click();
		
		return new HomePage();
	}
}

