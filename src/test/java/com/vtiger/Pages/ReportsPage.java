package com.vtiger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.lib.Commonarguments;

public class ReportsPage extends HeaderPage1 {
	
	public WebDriver driver;
	
	public ReportsPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	
	@FindBy(linkText="Invoice Reports")
	WebElement elminv;
	
	@FindBy(linkText="Customize")
	WebElement elmcust;
	
	@FindBy(name="reportType")
	WebElement elmty;
	
	@FindBy(linkText="Select Columns")
	WebElement elmcol;
	
	@FindBy(name="Button")
	WebElement elmadd;
	
	@FindBy(name="availList")
	WebElement elmavail;
	
	@FindBy(linkText="Choose Columns To Total")
	WebElement elmchoose;
	
	@FindBy(name="cb:invoice:exciseduty:Excise_Duty:2")
	WebElement elmcb;
	
	@FindBy(name="Group1")
	WebElement elmgrp;
	
	@FindBy(name="Sort1")
	WebElement elmsort;
	
	@FindBy(linkText="Specify Criteria")
	WebElement elmspe;
	
	@FindBy(name="stdDateFilterField")
	WebElement elmstd;
	
	@FindBy(name="stdDateFilter")
	WebElement elmfil;
	
	@FindBy(name="btnSaveAndRun")
	WebElement elmrun;
	
	
	
	public void ReportTest() throws InterruptedException
	{
		clickEmails();
		clickright();
		clickreports();
		ca.ClickElement(driver,elminv,"invoice");
		ca.ClickElement(driver,elmcust,"customize");
		ca.ClickElement(driver,elmty,"Summary");
		Thread.sleep(2000);
		ca.ClickElement(driver,elmcol,"select col");
		ca.EnterValue(driver,elmavail,"invoice:customerno:Invoice_Customer_No:customerno:V","added");
		ca.ClickElement(driver,elmadd, "added");
		ca.ClickElement(driver,elmchoose,"choosed");
		ca.ClickElement(driver,elmcb,"add");
		ca.ClickElement(driver,elmspe,"specific");
		ca.EnterValue(driver,elmstd,"invoice:duedate:Invoice_Due_Date","date");
		ca.EnterValue(driver,elmfil,"nextfq","fq");
		ca.ClickElement(driver,elmrun,"runner");
		
		
		
	}
	}
	
	
	
	
	
	


