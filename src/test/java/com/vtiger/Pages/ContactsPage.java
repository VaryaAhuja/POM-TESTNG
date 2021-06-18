package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class ContactsPage extends HeaderPage1 {
	
	public WebDriver driver;
	
	public ContactsPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	@FindBy(xpath="//input[@name='firstname'][1]")
	WebElement elmfirst;
	
	@FindBy(xpath="//input[@name='lastname'][1]")
	WebElement elmlast;
	
	@FindBy(name="accountname")
	WebElement elmacc;
	
	@FindBy(name="button")
	WebElement elmsub;
	
	@FindBy(name="selected_id")
	WebElement elmsel;
	
	@FindBy(linkText="edit")
	WebElement elmed;
	
	@FindBy(name="btn1")
	WebElement elmtn;
	
	@FindBy(name="leadsource")
	WebElement elmsr;
	
	@FindBy(name="name")
	WebElement elmna;
	
	
	
	public void verifycontact() throws InterruptedException
	{
		clickContacts();
		ca.EnterValue(driver,elmfirst,"Mary","firstfield");
		ca.EnterValue(driver,elmlast,"Smith","lastfield");
		ca.EnterValue(driver, elmacc, "X-CEED INC 99","Accountname");
		ca.ClickElement(driver, elmsub,"Search");
		ca.ClickElement(driver,elmsel,"Selected");
		ca.ClickElement(driver,elmed,"Editing");
		Thread.sleep(3000);
		
	}
	

}
