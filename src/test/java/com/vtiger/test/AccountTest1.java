package com.vtiger.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.Pages.AccountPage1;
import com.vtiger.Pages.HeaderPage1;
import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.LoginPage1;

public class AccountTest1 extends BaseTest1 {
	


@Test(groups= {"Sanity"})
public void verifyaccounttest() 
{
	logger = extent.createTest("verifyaccounttest");
	
	
	AccountPage1 accp1 = new AccountPage1(driver);
	accp1.createaccset();
	extent.flush();
	
}
	
	

}
