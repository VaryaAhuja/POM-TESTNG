package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.SalesOrderPage;

public class SalesOrderTest extends BaseTest1 {
	
	@Test(groups= {"Sanity"})
	
	public void VerifySalesOrder()
	{
		logger = extent.createTest("VerifySalesOrder");
		SalesOrderPage sop = new SalesOrderPage(driver);
		sop.salesorder();
		extent.flush();
		
			
	}

}
