package com.vtiger.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vtiger.Pages.LoginPage1;

public class LoginTest1 extends BaseTest1 {
	
	
	
	
	@Test(groups= {"Smoke"})
	public void ValidLogin()
	{
		
		LoginPage1 lp1 = new LoginPage1(driver);
		lp1.VerifyLogin("admin","admin");
		driver.quit();
		
	}	
}
			