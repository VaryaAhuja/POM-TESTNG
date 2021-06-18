package com.vtiger.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.glass.events.KeyEvent;
import com.vtiger.lib.Commonarguments;

public class ProductPage1  extends HeaderPage1{
	
	private static final TimeUnit TimeUnit = null;

	private static final String Sec = null;

	public WebDriver driver;
	
	public ProductPage1(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	Commonarguments ca = new Commonarguments();
	
	@FindBy(name="productname")
	WebElement elmprd;
	
	@FindBy(name="discontinued")
	WebElement elmdis;
	
	@FindBy(name="manufacturer")
	WebElement elmman;
	
	@FindBy(name="sales_end_date")
	WebElement elmend;
	
	@FindBy(name="expiry_date")
	WebElement elmexp;
	
	@FindBy(id="jscal_trigger_sales_end_date")
	WebElement elmimg;
	
	@FindBy(id="jscal_trigger_sales_start_date")
	WebElement elmsrc;
	
		
	@FindBy(name="productcategory")
	WebElement prdctg;
	
	@FindBy(name="parent_type")
	WebElement prnttype;
	
	@FindBy(name="contact_name")
	WebElement elmcntname;
	
	@FindBy(name="vendor_name")
	WebElement elmvnd;
	
	@FindBy(name="glacct")
	WebElement glct;
	
	@FindBy(name="commissionrate")
	WebElement  cmsnrate;
	
	@FindBy(xpath="//input[@name='button'][1]")
	WebElement elmbutton;
	
	@FindBy(name="imagename")
	WebElement elmimage;
	
	
	public void producttest(String prdt,String maft,String catgy,String type,String gact) throws InterruptedException, AWTException
	{
		clicknewproduct();
		ca.EnterValue(driver,elmprd,prdt,"product");
		ca.ClickElement(driver, elmdis,"Dis");
		ca.EnterValue(driver,elmman,maft,"Manufacturer");
		ca.EnterValue(driver,prdctg,catgy,"Category");
		ca.EnterValue(driver,prnttype,type,"type");
		ca.EnterValue(driver,glct,gact,"Gaccount");
		ca.ClickElement(driver,glct,"accglct");
		ca.ClickElement(driver,elmbutton,"btnclick");
		driver.switchTo().alert().accept();
		
		Actions builder = new Actions(driver);
		builder.moveToElement(elmimage).click().build().perform();
		
		Thread.sleep(1000);
		
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
		ca.ClickElement(driver,elmbutton,"buttonswitch");
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
	}
	}
