package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.SettingPage1;

public class SettingsTest1 extends BaseTest1 {
	/*
	@Test(groups= {"Smoke"})
	public void VerifySettings()
	{
		logger = extent.createTest("VerifySettings");
		SettingPage1 sp1 = new SettingPage1(driver);
		sp1.settingpage();
		extent.flush();
	}
	
	@Test(groups= {"Smoke"})
	public void verifyuser()
	{
		logger = extent.createTest("Verifyuser");
		SettingPage1 sp1 = new SettingPage1(driver);
		sp1.UserManagement();
		extent.flush();
	}
	*/
	
	@Test(groups= {"Smoke"})
	public void verifycustom()
	{
		logger = extent.createTest("Verifycustom");
		SettingPage1 sp1 = new SettingPage1(driver);
		sp1.customfield();
		extent.flush();
	}

	
}
