package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.vtiger.lib.Commonarguments;

public class HomePage1 extends HeaderPage1{
	
	public  WebDriver driver;
	
	Commonarguments ca = new Commonarguments();

	
	public  HomePage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//*[contains(text(),'My Upcoming and')]")
	WebElement elmMyUpcoming;
	
	
	
	
	public boolean homepagelogin()
	{
		return ca.VerifyElementPresent(driver, elmMyUpcoming,"upcoming");
	}
	
	
	
}
