package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.DashboardPage1;

public class DashBoardTest1 extends BaseTest1 {
	
	@Test(groups= {"Smoke"})
	public void verifyDash()
	{
		logger = extent.createTest("VerifyDash");
		DashboardPage1 dp1 = new DashboardPage1(driver);
				dp1.dashboardtest();
				extent.flush();
	}

}
