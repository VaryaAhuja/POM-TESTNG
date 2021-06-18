package com.vtiger.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.glass.events.KeyEvent;
import com.vtiger.lib.Commonarguments;

public class NewNotePage extends HeaderPage1 {
	
	public WebDriver driver;
	
	public NewNotePage(WebDriver driver)

	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	
	@FindBy(name="title")
	WebElement elmtle;
	
	@FindBy(name="filename")
	WebElement elmfil;
	
	@FindBy(name="parent_type")
	WebElement elmpty;
	
	public void newnote() throws InterruptedException, AWTException
	{
		clickNewNote();
		ca.EnterValue(driver,elmtle,"vtiger","testing");
		ca.EnterValue(driver,elmpty,"Potentials","value");
		
		
	Actions builder = new Actions(driver);
		builder.moveToElement(elmfil).build().perform();
	//builder.click(elmfil).build().perform();

			
		
		StringSelection ss = new StringSelection("C:\\Users\\VARYA\\Desktop\\varya.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(1000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}
}

