package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class ActivitiesPage1  extends HeaderPage1{
	
	public WebDriver driver;
	
	public ActivitiesPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	@FindBy(linkText="Call user - John")
	WebElement elmuser;
	
	@FindBy(xpath="//input[@name='button'][30]")
	WebElement elmtt;
	
	public void activitytest()
	{
		clickactivities();
		ca.ClickElement(driver,elmuser,"user");
		
	}

}
