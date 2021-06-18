package com.vtiger.lib;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vtiger.test.BaseTest1;

public class Commonarguments {
	
	public WebDriver driver;
	
	public WebDriverWait W;
	
	
	public void EnterValue(WebDriver driver,WebElement elm,String val,String fieldname)
	{
		W = new WebDriverWait(driver,30);
		try
		{
			W.until(ExpectedConditions.visibilityOf(elm));
			elm.click();
			elm.sendKeys(val);
			BaseTest1.logger.pass(val+" has been entered in "+fieldname);
		}
		catch (Exception e)
		{
			
			BaseTest1.logger.fail(val+" has been entered in "+fieldname);
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
		
	}
	public void EnterInt(WebDriver driver,WebElement elm,int val,String fieldname)
	{
		W = new WebDriverWait(driver,30);
		try
		{
			W.until(ExpectedConditions.visibilityOf(elm));
			elm.click();
			elm.sendKeys(String.valueOf(val));
			
			
			BaseTest1.logger.pass(val+" has been entered in "+fieldname);
		}
		catch (Exception e)
		{
			
			BaseTest1.logger.fail(val+" has been entered in "+fieldname);
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
	}
	
	public void ClickElement(WebDriver driver,WebElement elm,String fieldname)
	{
		W = new WebDriverWait(driver,30);
		try
		{
			W.until(ExpectedConditions.elementToBeClickable(elm));
			elm.click();
			BaseTest1.logger.pass(fieldname+"   has been clicked");
		}
		catch (Exception e)
		{
			
			BaseTest1.logger.fail(fieldname+"   has not been clicked");
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
	}
	public boolean VerifyElementPresent(WebDriver driver,WebElement elm,String fieldname)
	{
		W = new WebDriverWait(driver,30);
		boolean val =true;
		try
		{
			W.until(ExpectedConditions.visibilityOf(elm));
			val=elm.isDisplayed();
			BaseTest1.logger.pass(fieldname+"  element is present");
		}
		
		catch (Exception e)
		{
			
			BaseTest1.logger.fail(fieldname+"  element is not present");
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
		return val;
	}
	
	public void SelectValue(WebDriver driver,WebElement elm,String val,String fieldname)
	{
		W = new WebDriverWait(driver,30);
		try
		{
			W.until(ExpectedConditions.elementToBeSelected(elm));
			Select sel = new Select(elm);
			sel.selectByValue(val);
			BaseTest1.logger.pass(fieldname+"  element is selected");
		}
		catch (Exception e)
		{
			
			BaseTest1.logger.fail(fieldname+"  element is not selected");
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
		
		
	}
	public void SelectIndex(WebDriver driver,WebElement elm,int index,String fieldname)
	{
		W = new WebDriverWait(driver,30);
		try
		{
			W.until(ExpectedConditions.elementToBeSelected(elm));
			Select ss = new Select(elm);
			ss.selectByIndex(index);
			BaseTest1.logger.pass(fieldname+"  element is selected");
		}
		catch (Exception e)
		{
			
			BaseTest1.logger.fail(fieldname+"  element is not selected");
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
		
		}
		
	public static String getScreenshot(WebDriver driver, String screenshotName)  {
		//below line is just to append the date format with the screenshot name to avoid duplicate names		
	    String destination=null;
		try
		{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//after execution, you could see a folder "FailedTestsScreenshots" under src folder
		destination = System.getProperty("user.dir") + "/src/test/java/com/vtiger/reports/screenshot/"+screenshotName+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//Returns the captured file path
		return destination;
	}
	
	
	public void mousemovement(WebDriver driver,WebElement elm,String fieldname)
	{
		W = new WebDriverWait(driver,30);
		try
		{
			
			Actions mouse = new Actions(driver);
			mouse.moveToElement(driver.findElement(By.id("showSubMenu"))).build().perform();
			W.until(ExpectedConditions.elementToBeClickable(elm));
			BaseTest1.logger.pass(fieldname+"  element is selected");
							
		}
		
		catch (Exception e)
		{
			
			BaseTest1.logger.fail(fieldname+"  element is not selected");
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
	}
	
	public void switchwindow(WebDriver driver,WebElement elm,String fieldname)
	{
		
		W = new WebDriverWait(driver,30);
		
		
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Set<String> set = driver.getWindowHandles();
			Iterator<String> iter1 = set.iterator();
			String firstwindow = iter1.next();
			String secondwindow = iter1.next();
			
		    driver.switchTo().window(secondwindow);
			
			
			//W.until(ExpectedConditions.visibilityOf(elm));
			//W = new WebDriverWait(driver,30);
					
			elm.click();
			//driver.switchTo().window(secondwindow).close();
			driver.switchTo().window(firstwindow);
			//BaseTest1.logger.pass(fieldname+"  element is selected");
		
			//BaseTest1.logger.fail(fieldname+"  element is not selected");
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			//System.out.println(e.getMessage());
		}
	
		
		public void threewindow(WebDriver driver,WebElement elm1,WebElement elm2,WebElement elm3,String val1,String val2,String fieldname)
		{
			W = new WebDriverWait(driver,30);
			try
			{
				Set<String> set = driver.getWindowHandles();
				Iterator<String> iter3 = set.iterator();
				String firstwindow = iter3.next();
				String secondwindow = iter3.next();
				String thirdwindow = iter3.next();
				driver.switchTo().window(secondwindow);
				W.until(ExpectedConditions.visibilityOf(elm1));
				elm1.sendKeys(val1);
				
				//Select dr = new Select(elm1);
				//dr.selectByIndex(1);
				
				elm2.click();
				driver.switchTo().window(thirdwindow);
				elm3.sendKeys(val2);
				elm3.click();
				driver.switchTo().window(thirdwindow).close();
				driver.switchTo().window(secondwindow).close();
				
				
				
				BaseTest1.logger.pass(fieldname+"  element is selected");
			}
			catch (Exception e)
			{
				BaseTest1.logger.fail(fieldname+"  element is not selected");
				BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
				System.out.println(e.getMessage());
			}
			
						
				
				
			}
		public void popupalertaccept(WebDriver driver,String fieldname)
		{
			W = new WebDriverWait(driver,30);
			try
			{
				
				driver.switchTo().alert().accept();
				BaseTest1.logger.pass(fieldname+"  element is selected");
			}
			catch (Exception e)
			{
				BaseTest1.logger.fail(fieldname+"  element is not selected");
				BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
				System.out.println(e.getMessage());
			}
		}
		
		public void popalertdismiss(WebDriver driver,String fieldname )
		
		{
			W = new WebDriverWait(driver,30);
			try
			{
				
				
				driver.switchTo().alert().dismiss();
			
			BaseTest1.logger.pass(fieldname+"  element is selected");
			}
		
		catch (Exception e)
		{
			BaseTest1.logger.fail(fieldname+"  element is not selected");
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
	}
		public void dragdrop(WebDriver driver,WebElement elm1,WebElement elm2,String fieldname)
		{
			W = new WebDriverWait(driver,30);
			
			try
			{
				W.until(ExpectedConditions.visibilityOf(elm1));
				Actions act1 = new Actions(driver);
				act1.dragAndDrop(elm1,elm2).build().perform();
				BaseTest1.logger.pass(fieldname+"  element is selected");
			}
		
		catch (Exception e)
		{
			BaseTest1.logger.fail(fieldname+"  element is not selected");
			BaseTest1.logger.info("Screenshot captured: <a href="+getScreenshot(driver,"file")+">Screenshot</a>");
			System.out.println(e.getMessage());
		}
				
				
									}
		}
	
	

