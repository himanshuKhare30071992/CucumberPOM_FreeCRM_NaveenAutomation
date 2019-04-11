package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;

	
	public TestBase()
	{
		String filePath = "C:/Users/HK-SONY/Selenium_Eclipse_Workspace/CucumberPOM_FreeCRM_NaveenAutomation/src/main/java/com/qa/config/config.properties";
		File file = new File(filePath);
		try 
		{
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void initilize()
	{
		String browserName = prop.getProperty("browserName");
		String applicationUrl = prop.getProperty("applicationUrl");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);		
		driver.get(applicationUrl);
		
	}
		
		
		
		
	
		
	}
	
	
	
	

