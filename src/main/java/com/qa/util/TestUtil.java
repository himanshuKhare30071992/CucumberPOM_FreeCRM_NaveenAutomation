package com.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class TestUtil 
{
	static int PAGE_LOAD_WAIT = 60;
	static int IMPLICIT_WAIT = 	60;
	static JavascriptExecutor jsObj;
	static Actions actObj;
	
	

	public static void flashElement(WebElement ele) throws InterruptedException
	{
		jsObj = (JavascriptExecutor)TestBase.driver;
		
		String elementDefautbgColor = ele.getCssValue("background-color");
		//System.out.println("-----elementDefautbgColor of WebElement is "+elementDefautbgColor);
		
		jsObj.executeScript("arguments[0].setAttribute('style' , 'background: yellow; border: 2px solid red;'); ", ele);
		Thread.sleep(500);
		jsObj.executeScript("arguments[0].setAttribute('style' , 'backgroundColor= "+elementDefautbgColor+"'); ", ele);
	
	}
}
