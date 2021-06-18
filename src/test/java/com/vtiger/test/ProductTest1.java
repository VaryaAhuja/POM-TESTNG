package com.vtiger.test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.LoginPage1;
import com.vtiger.Pages.ProductPage1;

public class ProductTest1 extends BaseTest1 {
	
	
	
	@Test(groups= {"Smoke"})
	public void producttesting() throws InterruptedException, AWTException
	{
		
		logger = extent.createTest("producttesting");
		ProductPage1 pp1 = new ProductPage1(driver);
		pp1.producttest("new","AltvetPet Inc.","Hardware","Accounts","303-Interest-Income");
		extent.flush();
		
	}
}
