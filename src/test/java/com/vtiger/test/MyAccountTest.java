package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.MyAccountPage;

public class MyAccountTest extends BaseTest1 {
	
	@Test(groups= {"Smoke"})
	public void VerifyAccounts()
	{
		logger = extent.createTest("VerifyAccounts");
		
		MyAccountPage ap = new MyAccountPage(driver);
		ap.verifymyaccount();
		extent.flush();

	}

}
