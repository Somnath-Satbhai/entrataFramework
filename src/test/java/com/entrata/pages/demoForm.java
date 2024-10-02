package com.entrata.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class demoForm {
	
WebDriver driver ;
	
	public demoForm (WebDriver ldriver) {
		
		this.driver = ldriver;
		
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']") WebElement firstName;
	@FindBy(xpath="//input[@placeholder='Last Name']") WebElement lastName;
	@FindBy(xpath="//input[@placeholder='Email']") WebElement Email;
	@FindBy(xpath="//input[@placeholder='Company Name']") WebElement companyName;
	@FindBy(xpath="//input[@placeholder='Phone Number']") WebElement phoneNumber;
	@FindBy(xpath="//input[@placeholder='Job Title']") WebElement jobTitle;
	@FindBy(xpath="//button[text()='Watch Demo']") WebElement watchDemo;

	
	
	public void submitDemoForm(String firstname, String lastname, String email, String companyname,String phonenumber,String jobtitle) throws InterruptedException {
		
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		Email.sendKeys(email);
		Thread.sleep(2000);
		companyName.sendKeys(companyname);
		phoneNumber.sendKeys(phonenumber);
		jobTitle.sendKeys(jobtitle);
	    Assert.assertEquals(watchDemo.getText(), "Watch Demo","watch demo is available");
    	System.out.println(watchDemo.getText()+"is available and form can submit");
	
}
	

}
