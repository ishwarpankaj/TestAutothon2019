package com.automation.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObject {

	@FindBy(xpath="//span[contains(text(),'Login')]")
	//@AndroidFindBy(xpath="//span[contains(text(),'Login')]")
	public WebElement logIn;
}
//"//div[@class='dHGf8H']/a")