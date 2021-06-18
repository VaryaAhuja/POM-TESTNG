package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.AccountPage1;
import com.vtiger.Pages.HeaderPage1;
import com.vtiger.Pages.ShowSubMenuPage;


public class ShowSubMenuTest extends BaseTest1 {
	
	@Test(groups= {"Sanity"})
	public void SubMenuTest()
	{
		logger = extent.createTest("verifyaccounttest");
		
		ShowSubMenuPage ss = new ShowSubMenuPage(driver);
		ss.subtest();
		extent.flush();
	}
	
	
	

	
}
