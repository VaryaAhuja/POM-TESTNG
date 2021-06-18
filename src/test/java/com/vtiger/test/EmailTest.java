package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.EmailPage;

public class EmailTest extends BaseTest1 {
	
	@Test(groups= {"Sanity"})
	public void emailtested()
	{
		logger=extent.createTest("emailtested");
		
		EmailPage ep = new EmailPage(driver);
		ep.emailtest();
		
		extent.flush();
				
	}

}
