package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.ActivitiesPage1;

public class ActivtiesTest1  extends BaseTest1{

	@Test(groups= {"Smoke"})
	public void VerifyTesting()
	{
		logger = extent.createTest("VerifyTesting");
				ActivitiesPage1 acp = new ActivitiesPage1(driver);
				acp.activitytest();
				extent.flush();
	}
}
