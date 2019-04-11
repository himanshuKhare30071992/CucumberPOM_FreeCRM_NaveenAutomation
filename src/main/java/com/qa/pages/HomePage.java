package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase
{

	@FindBy(xpath="//span[text()='Himanshu Khare']")
	WebElement usernameLabel;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[text()='Deals']")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[text()='Tasks']")
	WebElement tasksLink;
	
	
	
	
// All these 4 elements will be initialized 	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
			
	public boolean verifyCorrectUsernameLabel()
	{
		return usernameLabel.isDisplayed();
		
	}
}
