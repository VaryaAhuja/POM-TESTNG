package com.vtiger.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.vtiger.Pages.PotentialsPage;

public class PotentialsTest extends BaseTest1 {
	
	@Test(groups= {"Smoke"})

	public void VerifyPotentialTest() throws InterruptedException, AWTException, IOException
	{
		logger = extent.createTest("VerifyPotentialTest");
		PotentialsPage pp = new PotentialsPage(driver);
		pp.PotentialPage();
		extent.flush();
				
	}
}
