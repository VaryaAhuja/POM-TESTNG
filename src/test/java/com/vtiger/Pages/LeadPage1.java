package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class LeadPage1 extends HeaderPage1 {
	
	public WebDriver driver;
	
	public LeadPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	@FindBy(name="salutationtype")
	WebElement elmsal;
	
	@FindBy(name="firstname")
	WebElement elmfirst;
	
	@FindBy(name="lastname")
	WebElement elmlast;
	
	@FindBy(name="company")
	WebElement elmcomp;
	
	@FindBy(name="button")
	WebElement elmsave;

	public void createlead(String Sal,String Firstname,String Lastname,String Company)
	{
		clicknewlead();
		ca.SelectValue(driver, elmsal, Sal,"Selection");
		ca.EnterValue(driver, elmfirst,Firstname,"firstname");
		ca.EnterValue(driver, elmlast, Lastname,"lastname");
		ca.EnterValue(driver,elmcomp, Company,"Company");
		ca.ClickElement(driver, elmsave,"Savedata");
	}
	
	
}