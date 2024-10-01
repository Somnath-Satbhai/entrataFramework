package com.entrata.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.entrata.pages.entrataBaseClass;
import com.entrata.pages.loginToEntratapages;
import com.entrata.utilities.Browserfactory;

public class logiToEntrata extends entrataBaseClass{
	
	@Test(priority=1)
	 
	public void loginTestCase() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		loginToEntratapages loginpage = PageFactory.initElements(driver, loginToEntratapages.class);
		loginpage.loginToEntrata("Test123", "Test456"); 
		/* loginpage.verifyPageTitle(); */
		
	}
	@Test(priority=2)
	 
	public void verifypageTitle() {
		
		System.out.println(driver.getTitle());
		loginToEntratapages loginpage = PageFactory.initElements(driver, loginToEntratapages.class);
		loginpage.verifyPageTitle();
		
	}
	@Test(priority=3)
	 
	public void verifySolutionDropdown() {
		
		System.out.println(driver.getTitle());
		loginToEntratapages loginpage = PageFactory.initElements(driver, loginToEntratapages.class);
		loginpage.verifyFields();
		
	}

}
