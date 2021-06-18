package com.vtiger.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.LeadPage1;
import com.vtiger.Pages.LoginPage1;

public class LeadTest1 extends BaseTest1 {

	
	
	@Test(groups= {"Smoke"})
	public void leadcreation()
	{
		
		logger = extent.createTest("leadcreation");
		LeadPage1 Ldp1 = new LeadPage1(driver);
		Ldp1.createlead("Mr.", "Rohit","Bajaj","HPCL");
		extent.flush();
	}

}
