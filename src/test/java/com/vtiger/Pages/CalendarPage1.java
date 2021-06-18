package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class CalendarPage1  extends HeaderPage{

	public WebDriver driver;
	
	public CalendarPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	Commonarguments ca = new Commonarguments();
	
	@FindBy()
}

