/**
 * 
 */
package com.automation.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.automation.baseclass.BaseClass;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utlity.GlobalParameters;
import com.automation.objects.HomePageObject;

/**
 * @author CHIRAG
 *
 */
public class LoginTest extends BaseClass{

	HomePage homePage ;
	LoginPage loginPage;
	HomePageObject homePageObject;
		
	@Test
	public void login() throws InterruptedException
	{
		BaseClass obj = new BaseClass();
		homePage = new HomePage();
		homePageObject= new HomePageObject();
		if(GlobalParameters.runType.equalsIgnoreCase("web"))
		{
			loginPage = homePage.clickOnSignIn();
		}else
		{
			//loginPage = new LoginPage();
			//homePage.clickOnSignIn();
			//obj.getDriver().findElement(By.xpath("//span[contains(text(),'Login')]")).click();
			obj.getDriver().getTitle();
			System.out.println(obj.getDriver().getTitle());
			//*[@id="container"]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/a/input
			obj.getDriver().findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/a/input")).sendKeys("Bye");
			//*[@id="container"]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/a/input
			
			obj.getDriver().findElement(By.xpath("//span[contains(text(),'Login')]")).click();
			
			obj.getDriver().findElement(By.xpath("//input[@class='_1i5zkb' and @id='1']")).sendKeys("7709433387");
			
			
			
			
		}
		/*
		 * loginPage.enterUserName("vodqa@gmail.com");
		 * loginPage.enterPassword("Hello12345678");
		 */
	}
}
