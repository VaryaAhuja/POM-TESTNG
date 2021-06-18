package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class SettingPage1 extends HeaderPage1 {
	
public  WebDriver driver;
	
	Commonarguments ca = new Commonarguments();
	
	public SettingPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="def_field_access_tgimg")
	WebElement elmdef;
	
	@FindBy(linkText="Event Field Access")
	WebElement elmaccess;
	
	@FindBy(linkText="Roles")
	WebElement elmro;
	
	@FindBy(name="New")
	WebElement elmnew;
	
	@FindBy(name="roleName")
	WebElement elmron;
	
	@FindBy(name="profileId")
	WebElement elmpro;
	
	@FindBy(name="save")
	WebElement elmsf;
	
	@FindBy(linkText="Custom Field Settings")
	WebElement elmcust;
	
	@FindBy(linkText="Potential Custom Fields")
	WebElement elmpotc;
	
	@FindBy(name="NewCustomField")
	WebElement elmfcn;
	
	@FindBy(xpath="//td[@id='field2']")
	WebElement elmcent;
	
	@FindBy(name="fldLabel")
	WebElement elmlab;
	
	@FindBy(name="fldLength")
	WebElement elmlengh;
	
	@FindBy(name="fieldLayer")
	WebElement elmlay;
	
	
	@FindBy(name="Submit")
	WebElement elmsub;
	
	
	
	
	public void settingpage()
	{
		clicksettings();
		ca.ClickElement(driver,elmdef,"def");
		ca.ClickElement(driver, elmaccess,"access");
	}
	
	public void UserManagement()
	{
		clicksettings();
		ca.ClickElement(driver,elmro,"roles");
		ca.ClickElement(driver,elmnew,"New");
		ca.EnterValue(driver,elmron,"adminuser","useradded");
		ca.EnterValue(driver,elmpro,"Sales Profile","user");
		ca.ClickElement(driver, elmsf,"Saved");
		
	}
	
	public void customfield() 
	{
		clicksettings();
		ca.ClickElement(driver,elmcust,"customer");
		ca.ClickElement(driver,elmpotc,"Potential");
		ca.ClickElement(driver,elmfcn,"Clicked");
		ca.ClickElement(driver,elmlay,"clicking");
		driver.switchTo().frame(0);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.ClickElement(driver,elmcent,"cent");
		driver.switchTo().defaultContent();
		
		ca.EnterValue(driver,elmlab,"vtiger","label");
		ca.EnterInt(driver,elmlengh,20,"pass");
		ca.ClickElement(driver,elmsub,"saved");
		
	}
	
}
