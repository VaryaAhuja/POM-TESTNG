package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.Pages.AccountPage1;
import com.vtiger.Pages.ContactsPage;

public class ContactsTest extends BaseTest1 {
	

@Test(groups= {"Sanity"})
public void ContactsTesting() throws InterruptedException 
{
	logger = extent.createTest("verifyaccounttest");
		
	ContactsPage cp = new ContactsPage(driver);
	cp.verifycontact();
	extent.flush();
	

}
	
}
