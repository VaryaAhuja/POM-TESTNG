package com.vtiger.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.LoginPage1;

public class HomeTest1 extends BaseTest1{

	
	
	@Test(groups= {"Sanity"})
	public void verifyhometest()
	{
		logger = extent.createTest("verifyhometest");
		HomePage1 Hp1 = new HomePage1(driver);
		Assert.assertEquals(Hp1.homepagelogin(),true);
		extent.flush();
		
		
			}
	
	
}
