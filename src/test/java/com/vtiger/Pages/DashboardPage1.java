package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class DashboardPage1 extends HeaderPage1 {

	
public WebDriver driver;
	
	public DashboardPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	Commonarguments ca = new Commonarguments();
	
	
	@FindBy(linkText="index.php?module=Potentials&action=ListView&date_closed=2005-03&sales_stage=Other&query=true")
	WebElement elmind;

	
	@FindBy(xpath="//img[@src='cache/images/-2082672713_outcome_by_month_en_us_957285009.png?modTime=1623730054']")
	WebElement elmir;
	
	public void dashboardtest()
	{
		clickdashboard();
		ca.ClickElement(driver,elmir,"img clicked");
		ca.ClickElement(driver,elmir,"Indexing");
		
		
	}
}
