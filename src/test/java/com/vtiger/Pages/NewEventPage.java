package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class NewEventPage  extends HeaderPage1{
	
	public WebDriver driver;
	
	public NewEventPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	
	@FindBy(name="subject")
	WebElement elmsub;
	
	@FindBy(name="recurringtype")
	WebElement elmrec;
	
	@FindBy(xpath="//input[@name='button'][1]")
	WebElement elmton;
	
	@FindBy(name="eventstatus")
	WebElement elmstatus;
	
	@FindBy(name="set_reminder")
	WebElement elmrem;
	
	@FindBy(name="remdays")
	WebElement elmdays;
	
	@FindBy(name="remhrs")
	WebElement elmhrs;
	
	@FindBy(name="remmin")
	WebElement elmmin;
	
	@FindBy(name="first_name")
	WebElement elmfrst;
	
	@FindBy(linkText="Elizabeth Brown")
	WebElement elmbrwn;
	
	
	
	
	
	
	public void Eventtesting()
	{
		clickEvent();
		ca.EnterValue(driver, elmsub,"vtiger","subject");
		ca.EnterValue(driver,elmrec, "Weekly","Recurring");
		ca.EnterValue(driver,elmstatus,"Held","Status");
		ca.ClickElement(driver,elmrem,"reminder");
		
		
		
		
	}
}
