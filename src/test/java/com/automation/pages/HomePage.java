/**
 * 
 */
package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.baseclass.BaseClass;
import com.automation.objects.HomePageObject;
import com.automation.utlity.GernalKeywors;
import com.automation.utlity.GlobalParameters;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author CHIRAG
 *
 */
public class HomePage {

	HomePageObject homePageObject = new HomePageObject();
	
	public HomePage() {
		BaseClass obj = new BaseClass();
		if(GlobalParameters.runType.equalsIgnoreCase("web"))
		{
			PageFactory.initElements(obj.getDriver(), homePageObject);
		}else
		{
			PageFactory.initElements(new AppiumFieldDecorator(obj.getDriver()), homePageObject);
		}
		/*
		 * WebDriver driver = obj.getDriver(); System.out.println(driver);
		 * PageFactory.initElements(driver, homePageObject);
		 */
	}
	
	public LoginPage clickOnSignIn() throws InterruptedException
	{
		Thread.sleep(10);
		GernalKeywors.click(homePageObject.logIn);
		return new LoginPage();
	}
	
	
}
