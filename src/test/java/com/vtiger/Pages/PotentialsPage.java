package com.vtiger.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.glass.events.KeyEvent;
import com.vtiger.lib.Commonarguments;

public class PotentialsPage extends HeaderPage1 {
	
	public WebDriver driver;
	
	public PotentialsPage(WebDriver driver)

	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	Commonarguments ca = new Commonarguments();
	
	@FindBy(name="potentialname")
	WebElement elmpotn;
	
	@FindBy(linkText="Import Potentials")
	WebElement elmimp;
	
	@FindBy(linkText="Export All Potentials")
	WebElement elmexp;
	
	@FindBy(linkText="edit")
	WebElement elmed;
	
	@FindBy(linkText="del")
	WebElement elmde;
	
	@FindBy(name="source")
	WebElement elmsou;
	
	@FindBy(name="button")
	WebElement elmti;
	
	@FindBy(name="userfile")
	WebElement elmfile;
	
	@FindBy(name="button")
	WebElement elm1b;
	
	
	public void PotentialPage() throws InterruptedException, AWTException, IOException
	{
		clickPotentials();
		ca.ClickElement(driver,elmexp,"export");
		ca.ClickElement(driver,elmimp,"import");
		ca.ClickElement(driver,elmsou,"Source");
		ca.ClickElement(driver,elmti,"Button Clicked");
				
		Actions builder = new Actions(driver);
		builder.moveToElement(elmfile).click().build().perform(); 
					
		StringSelection kk = new StringSelection("C:\\Users\\VARYA\\Desktop\\varya.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(kk,null);
		
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
		ca.ClickElement(driver, elm1b,"clicked");
	}
}
