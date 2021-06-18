package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class HeaderPage1 {
	
	public WebDriver driver;
	
	public HeaderPage1(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	Commonarguments ca = new Commonarguments();
	
	@FindBy(linkText="Contacts")
	WebElement elmcont;
	
	@FindBy(linkText="Activities")
	WebElement elmvty;
	
	
	@FindBy(linkText="New Lead")
	WebElement elmlead;
	
	@FindBy(linkText="New Account")
	WebElement elmaccount;
	
	@FindBy(linkText="New Product")
	WebElement elmProduct;
	
	@FindBy(linkText="New Ticket")
	WebElement elmticket;
	
	@FindBy(linkText="Logout")
	WebElement elmlogout;
	
	@FindBy(id="showSubMenu")
	WebElement elmssm;
	
	@FindBy(linkText="HelpDesk")
	WebElement elmhelp;
	
	@FindBy(linkText="Emails")
	WebElement elmmil;
	
	@FindBy(linkText="New Event")
	WebElement elmevent;
	
	@FindBy(linkText="New Sales Order")
	WebElement elmso;
	
	@FindBy(linkText="Potentials")
	WebElement elmpot;
	
	@FindBy(xpath="//img[@src='themes/blue/images/scroll_right.gif']")
	WebElement elmsr;
	
	@FindBy(linkText="Reports")
	WebElement elmrep;
	
	@FindBy(linkText="New Note")
	WebElement elmnote;
	
	@FindBy(linkText="My Account")
	WebElement elmmy;
	
	@FindBy(linkText="Settings")
	WebElement elmsett;
	

	@FindBy(linkText="Dashboard")
	WebElement elmdash;
	
	public void clickdashboard()
	{
		ca.ClickElement(driver,elmdash,"DashBoard");
	}

	
	public void clickactivities()
	{
		ca.ClickElement(driver,elmvty,"Activity");
	}
	public void clicksettings()
	{
		ca.ClickElement(driver,elmsett,"settings");
	}
	public void clickNewNote()
	{
		ca.ClickElement(driver,elmnote,"note");
	}
	
	
	public void clickright()
	{
		ca.ClickElement(driver,elmsr,"clicked right");
	}
	
	public void clickreports()
	{
		ca.ClickElement(driver,elmrep,"reports");
	}
	
	public void verifylogout()
	{
		ca.ClickElement(driver,elmlogout,"logoff");
	}
	
	public void clicknewlead()
	{
		ca.ClickElement(driver, elmlead,"LeadCreation");
	}
	
	public void clicknewaccount()
	{
		ca.ClickElement(driver,elmaccount,"accountcreation");
	}
	
	public void clicknewproduct()
	{
		ca.ClickElement(driver,elmProduct,"productcreation");
	}
	
	public void clicknewticket()
	{
		ca.ClickElement(driver,elmticket,"ticketcreation");
	}
	
	public void clickshowsubmenu()
	{
		ca.mousemovement(driver, elmssm,"submenu");
	}
	
	public void clickhelpdesk()
	{
		ca.ClickElement(driver, elmhelp,"Helpdesk");
	}
	
	public void clickContacts()
	{
		ca.ClickElement(driver, elmcont, "Contacts");
	}
	
	public void clickEmails()
	{
		ca.ClickElement(driver, elmmil, "Emails");
	}
	
	public void clickEvent()
	{
		ca.ClickElement(driver,elmevent,"NewEvent");
}
	
	public void clicknewso()
	{
		ca.ClickElement(driver,elmso,"so");
	}
	
	public void clickPotentials()
	{
		ca.ClickElement(driver,elmpot,"potetial");
	}
	
	public void clickmyaccount()
	{
		ca.ClickElement(driver,elmmy,"Account");
	}
}


