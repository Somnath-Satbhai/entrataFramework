package com.entrata.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.entrata.pages.demoForm;
import com.entrata.pages.entrataBaseClass;
import com.entrata.pages.loginToEntratapages;
import com.entrata.pages.residentLoginPage;
import com.entrata.utilities.Browserfactory;

public class logiToEntrata extends entrataBaseClass{
	
	@Test
	 
	public void submitDemoForm() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		demoForm loginpage = PageFactory.initElements(driver, demoForm.class);
		loginpage.submitDemoForm("First Name", "Last Name","example@email.com","Company Name","Phone Number","Automation Engineer"); 
		 
		
	}
	
	
	@Test(priority=1)
	 
	public void loginTestCase() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		loginToEntratapages loginpage = PageFactory.initElements(driver, loginToEntratapages.class);
		loginpage.loginToEntrata("Test123", "Test456"); 
		loginpage.verifyPageTitle(); 
		
	}
	@Test(priority=2)
	 
	public void verifypageTitle() {
		
		System.out.println(driver.getTitle());
		loginToEntratapages loginpage = PageFactory.initElements(driver, loginToEntratapages.class);
		loginpage.verifyPageTitle();
		
	}
	
	@Test(priority=4)
	 
	public void residentLoginPage1() throws InterruptedException {
		
		System.out.println(driver.getTitle());
		residentLoginPage loginpage = PageFactory.initElements(driver, residentLoginPage.class);
		loginpage.residentLoginPage1();
		
	}
	@Test(priority=3)
	 
	public void verifySolutionDropdown() {
		
		System.out.println(driver.getTitle());
		loginToEntratapages loginpage = PageFactory.initElements(driver, loginToEntratapages.class);
		loginpage.verifyFields();
		
	}

}
