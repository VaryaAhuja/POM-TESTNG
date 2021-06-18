package com.vtiger.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class ShowSubMenuPage extends HeaderPage1{

	public WebDriver driver;
	
	public ShowSubMenuPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	Commonarguments ca = new Commonarguments();
	
	
	@FindBy(linkText="New PriceBook")
	WebElement elmnpb;
	
	
	
	@FindBy(name="active")
	WebElement elmact;
	
	@FindBy(xpath="//input[@name='button'][1]")
	WebElement elmbn;
	
	@FindBy(name="description")
	WebElement elmdesc;
	
	@FindBy(name="bookname")
	WebElement elmname;
	
	
	public void subtest()
	{
		clickshowsubmenu();
		ca.ClickElement(driver, elmnpb, "NewPriceBook");
		ca.EnterValue(driver,elmname,"vtiger","bookname");
		ca.ClickElement(driver, elmact, "Clicked");
		ca.ClickElement(driver,elmbn,"button");
		
	}
		
		
		
		
	
}
