package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class Helpdesk extends HeaderPage1 {
	
	public WebDriver driver;
	
	public Helpdesk(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	Commonarguments ca = new Commonarguments();
	
	
	@FindBy(name="ticket_title")
	WebElement elmtt;
	
	
	@FindBy(name="priority")
	WebElement elmpr;
	
	@FindBy(name="status")
	WebElement elmst;
	
	@FindBy(name="category")
	WebElement elmct;
	
	@FindBy(name="current_user_only")
	WebElement elmcut;
	
	@FindBy(name="button")
	WebElement elmbv;
	
	@FindBy(linkText="Cumulative Statistics")
	WebElement elmcs;
	
	@FindBy(name="date_crit")
	WebElement elmdate;
	
	public void helpdesktest() 
	{
		clickhelpdesk();
		ca.EnterValue(driver,elmtt,"vtiger","newfield");
		ca.EnterValue(driver,elmpr,"Urgent","index");
		ca.EnterValue(driver,elmst,"In Progress","Status");
		ca.EnterValue(driver,elmct,"Other Problem","category");
		ca.EnterValue(driver, elmdate,"before","before date");
		ca.ClickElement(driver, elmcut,"current user");
		ca.ClickElement(driver, elmbv, "success");
		
	}
}
