package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class TicketPage1 extends HeaderPage1{

	
	public WebDriver driver;
	
	public TicketPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	@FindBy(name="assigntype")
	WebElement elmass;
	
	@FindBy(name="assigned_user_id")
	WebElement elmast;
	
	@FindBy(name="ticketstatus")
	WebElement elmtck;
	
	@FindBy(name="ticketcategories")
	WebElement elmcatg;
	
	@FindBy(name="ticket_title")
	WebElement elmtt;
	
	@FindBy(xpath="(//input[@name='button'])[1]")
	WebElement elmsave;
	
	public void tickettesting(String ass,String tck,String catg,String title)
	{
		clicknewticket();
		ca.EnterValue(driver, elmass, ass,"Assigntype");
		ca.EnterValue(driver, elmtck,tck,"ticketstatus");
		ca.EnterValue(driver, elmcatg, catg,"Ticketcategory");
		ca.EnterValue(driver, elmtt, title,"Title");
		ca.ClickElement(driver, elmsave,"Savingdata");
		
	}
}

