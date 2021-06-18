package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.ReportsPage;

public class ReportTest1  extends BaseTest1{

	@Test(groups= {"sanity"})
	public void verifyreports() throws InterruptedException
	{
		logger=extent.createTest("verifyreports");
		ReportsPage rp = new ReportsPage(driver);
		rp.ReportTest();
		extent.flush();
	}
}
