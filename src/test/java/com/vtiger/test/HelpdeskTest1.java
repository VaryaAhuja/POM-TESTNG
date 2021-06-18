package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.AccountPage1;
import com.vtiger.Pages.Helpdesk;

public class HelpdeskTest1 extends BaseTest1 {
	
	@Test(groups= {"Sanity"})
	public void VerifyHelpdesktestt() 
	{
		logger = extent.createTest("verifyaccounttest");
		Helpdesk de = new Helpdesk(driver);
		de.helpdesktest();
		extent.flush();

}
}
