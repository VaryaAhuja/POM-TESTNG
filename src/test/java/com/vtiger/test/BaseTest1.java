package com.vtiger.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vtiger.Pages.HeaderPage1;
import com.vtiger.Pages.HomePage1;
import com.vtiger.Pages.LoginPage1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1 {
	
	

	public static WebDriver driver;
	
	public Properties prop;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeClass(groups= {"Smoke","Sanity"})
	public void readersetting() throws IOException  
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/vtiger/config/Utilities.properties");
		prop.load(fis);
		createreport();
		openbrowser();
			
	}
		
	
	public void openbrowser()
	{
		logger=extent.createTest("Launching application and perform test");
		if(prop.getProperty("browser").equals("chrome"))
		{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\VARYA\\Desktop\\Automation\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		 driver =  (WebDriver) new ChromeDriver();
		}
		if(prop.getProperty("browser").equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\VARYA\\Desktop\\Automation\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			 driver =   (WebDriver) new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		int time = Integer.parseInt(prop.getProperty("wait"));
		
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		
		
		LoginPage1 lp1 = new LoginPage1(driver);
		lp1.VerifyLogin(prop.getProperty("user_name"),prop.getProperty("user_password"));
		extent.flush();
		
	}
	
	public void createreport()
	{
		DateFormat f = new SimpleDateFormat("YYYY_MM_DD_HH_MM_SS");
		Date d = new Date();
		String str = f.format(d);
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/src/test/java/com/vtiger/reports/ExtentReport"+str+".html");
    	// Create an object of Extent Reports
		extent = new ExtentReports();  
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "Automation Test Hub");
		extent.setSystemInfo("Environment", "Test");
		extent.setSystemInfo("User Name", "Ritika");
		htmlReporter.config().setDocumentTitle("Title of the Report Comes here "); 
		            // Name of the report
		htmlReporter.config().setReportName("Name of the Report Comes here "); 
		            // Dark Theme
		htmlReporter.config().setTheme(Theme.DARK); 
	}

	@AfterClass(groups= {"Smoke","Sanity"})
	public void closebrowser()
	{
		HeaderPage1 Hd1 = new HeaderPage1(driver);
		Hd1.verifylogout();
		
		driver.quit();
	}
}
