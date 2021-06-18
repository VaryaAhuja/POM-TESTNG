package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class SalesOrderPage extends HeaderPage1 {
	
	public WebDriver driver;
	
	public SalesOrderPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	@FindBy(name="subject")
	WebElement elmsbj;
	
	@FindBy(name="bill_street")
	WebElement elmbstr;
	
	@FindBy(name="ship_street")
	WebElement elmship;
	
	@FindBy(name="txtProduct1")
	WebElement elmprd;
	
	@FindBy(xpath="//img[@src='themes/blue/images/search.gif']")
	WebElement elmsr;
	
	@FindBy(name="txtQty1")
	WebElement elmqty;
	
	/*@FindBy(name="txtListPrice1")
	WebElement elmprc;*/
	
	@FindBy(name="sostatus")
	WebElement elmso;
	
	@FindBy(name="btn1")
	WebElement elmt1;
	
	@FindBy(name="button")
	WebElement elmon;
	
	@FindBy(name="productname")
	WebElement elmprod;
	
	@FindBy(name="button")
	WebElement elmttn;
	
	@FindBy(linkText="Double Panel See-thru Clipboard")
	WebElement elmdbl;
	
	@FindBy(name="name")
	WebElement elmme;
	
	@FindBy(linkText="X-CEED INC 99")
	WebElement elmceed;
	
	
	@FindBy(name="copyright")
	WebElement elmcopy;

	public void salesorder()
	{
		clickshowsubmenu();
		clicknewso();
		ca.EnterValue(driver,elmsbj,"Vtiger","subject");
		ca.EnterValue(driver, elmbstr,"Mainlane56","bill");
		ca.ClickElement(driver,elmsr,"image clicked");
		ca.switchwindow(driver,elmdbl,"clicked");
		ca.EnterValue(driver,elmqty,"10","quantities");
		ca.EnterValue(driver,elmso,"Delivered","Delieverystatus");
		ca.ClickElement(driver, elmt1,"Clicked");
		ca.switchwindow(driver,elmceed,"entered");
		
		
		
	}
	

	
	
	
	

}
