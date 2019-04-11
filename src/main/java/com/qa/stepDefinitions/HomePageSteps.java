package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.*;

public class HomePageSteps extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;
	
	
	
	@Given("^user open browser$")
	public void user_open_browser() throws Throwable 
	{
		TestBase.initilize();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable 
	{
		loginpage = new LoginPage();
		String actualTitle = loginpage.validateLoginPageTitle();
		Assert.assertEquals("CRM", actualTitle);
	}

	
	@Then("^user logs into application$")
	public void user_logs_into_application() throws Throwable
	{
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable 
	{
		String actualHomepagetitle = homepage.verifyHomePageTitle();
		Assert.assertEquals("Verification Failed", "CRM", actualHomepagetitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable 
	{
		boolean flag = homepage.verifyCorrectUsernameLabel();
		Assert.assertTrue(flag);
	}

	
}
