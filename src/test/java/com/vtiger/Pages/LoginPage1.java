package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class LoginPage1 extends HeaderPage1 {
	
	public WebDriver driver;
	
	Commonarguments ca = new Commonarguments();
	
	public  LoginPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
	@FindBy(name="user_name")
	WebElement elmuser;
	
	@FindBy(name="user_password")
	WebElement elmpass;
	
	@FindBy(name="Login")
	WebElement elmlogin;
	
	public void VerifyLogin(String userid,String password)
	{
	ca.EnterValue(driver,elmuser,userid,"username");
	ca.EnterValue(driver, elmpass,password,"password");
	ca.ClickElement(driver, elmlogin,"login");
	}
	
	
}
