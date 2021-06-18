package com.vtiger.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.LoginPage1;
import com.vtiger.Pages.TicketPage1;

public class TicketTest1 extends BaseTest1 {

	
	
	@Test(groups= {"Smoke"})
	public void tickettest()
	{
		
		logger = extent.createTest("tickettest");
		TicketPage1 Tp1 = new TicketPage1(driver);
		Tp1.tickettesting("U","Wait For Response","Small Problem","your ticket is already booked");
		extent.flush();
		
		
		
			}
}
