package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.NewEventPage;

public class NewEventTest extends BaseTest1 {
	
	@Test(groups= {"Smoke"})
	public void newly()
	{
		logger = extent.createTest("newly");
		NewEventPage nep = new NewEventPage(driver);
		nep.Eventtesting();
		extent.flush();
	}
	

}
