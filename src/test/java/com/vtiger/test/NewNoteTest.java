package com.vtiger.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.vtiger.Pages.NewNotePage;

public class NewNoteTest extends BaseTest1 {
	
	@Test(groups= {"Smoke"})
	public void verifynote() throws InterruptedException, AWTException
	{
		logger = extent.createTest("verifynote");
		NewNotePage nnp = new NewNotePage(driver);
		nnp.newnote();
		extent.flush();
	}
	

}
