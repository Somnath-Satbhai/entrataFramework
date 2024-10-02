package com.entrata.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class residentLoginPage {
	
WebDriver driver ;
	
	public residentLoginPage (WebDriver ldriver) {
		
		this.driver = ldriver;
		
	}
	
	@FindBy(xpath="//a[text()='Sign In']") WebElement signInBtn;
	@FindBy(xpath="//div[text()='Resident Login']") WebElement residentLogin;
	@FindBy(xpath="//div[text()='View the Website']") WebElement viewTheWebsite;	
	@FindBy(xpath="//div[text()='Enroll']") WebElement Enroll;
	@FindBy(xpath="//div[text()='Edit Account Information']") WebElement AccountInfo;
	@FindBy(xpath="//div[text()='Make a Payment']") WebElement payment;
	@FindBy(xpath="//div[text()='Set Up a Recurring Payment']") WebElement recuuringpayment;
	@FindBy(xpath="//div[text()='Submit a Maintenance Request']") WebElement submitRequest;
	@FindBy(xpath="//div[text()='Contact the Property']") WebElement property;
	
	public void residentLoginPage1() throws InterruptedException {
	
			signInBtn.click();
			residentLogin.click();
			//verifying the page title
			String pageTitle = "Welcome to the Resident Portal App";
			assertEquals(pageTitle, driver.getTitle());
			viewTheWebsite.click();
		    Assert.assertEquals(Enroll.getText(), "Enroll","Enroll is available");
		    Assert.assertEquals(AccountInfo.getText(), "Edit Account Information","Edit Account Information");
		    Assert.assertEquals(payment.getText(), "Make a Payment","Make a Payment");
		    Assert.assertEquals(recuuringpayment.getText(), "Set Up a Recurring Payment","Set Up a Recurring Payment");
		    Assert.assertEquals(submitRequest.getText(), "Submit a Maintenance Request","Submit a Maintenance Request");
		    Assert.assertEquals(property.getText(), "Contact the Property","Contact the Property");
		    driver.navigate().back();
	    	Thread.sleep(2000);
	    	driver.navigate().back();	
		
	}
}

