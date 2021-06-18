package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class MyAccountPage extends HeaderPage1 {
	
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	
	
	@FindBy(name="Customise")
	WebElement elmtc;
	
	@FindBy(id="cl2")
	WebElement elmc12;
	
	@FindBy(id="cl7")
	WebElement elmc17;
	
	public void verifymyaccount()
	{
		clickmyaccount();
		ca.ClickElement(driver,elmtc,"Customization");
		ca.dragdrop(driver,elmc12,elmc17,"dragged");
	}
	
	
}
