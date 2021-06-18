package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class EmailPage extends HeaderPage1 {

public WebDriver driver;

public EmailPage(WebDriver driver)
{
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}

 Commonarguments ca = new Commonarguments();
 
 @FindBy(linkText="Export All Emails")
 WebElement elmexport;
 
 @FindBy(linkText="Create View")
 WebElement elmview;
 
 @FindBy(name="viewName")
 WebElement elmvn;
 
 @FindBy(name="setMetrics")
 WebElement elmmet;
 
 @FindBy(name="save")
 WebElement elmsf;

 @FindBy(id="column1")
 WebElement elmcol1;
 
 @FindBy(name="stdDateFilterField")
 WebElement elmstd;
 
 @FindBy(name="stdDateFilter")
 WebElement elmdate;
 
 public void emailtest() 
 {
	 clickEmails();
	 ca.ClickElement(driver, elmexport, "exported");
	 ca.ClickElement(driver,elmview,"Create view");
	 ca.EnterValue(driver,elmvn,"vtiger","name");
	 ca.ClickElement(driver,elmmet,"Default");
	 ca.ClickElement(driver,elmsf,"Saved data");
	 ca.popupalertaccept(driver,"Acepted");
	 
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 ca.EnterValue(driver, elmcol1,"crmentity:smownerid:assigned_user_id:Emails_Assigned_To:V","value");
	 
	ca.EnterValue(driver,elmstd,"crmentity:createdtime:createdtime:Emails_Created_Time","entered");
	ca.EnterValue(driver,elmdate,"nextfy","date");
	ca.ClickElement(driver,elmsf,"data saved");
	
	 
	 
	 
	 

 }
}

