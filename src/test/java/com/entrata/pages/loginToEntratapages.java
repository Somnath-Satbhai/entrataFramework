package com.entrata.pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class loginToEntratapages {
	
	WebDriver driver ;
	
	public loginToEntratapages (WebDriver ldriver) {
		
		this.driver = ldriver;
		
	}
	@FindBy(xpath="//div[text()='X']") WebElement closeTheCookie;
	@FindBy(xpath="//a[text()='Sign In']") WebElement signInBtn;
	@FindBy(xpath="//p[contains(text(),'If you are a property manager')]/following::div/a") WebElement propertyManageeLogin;
	@FindBy(xpath="//div[text()='Resident Login']") WebElement residentLogin;
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signInButton;
	@FindBy(xpath="//div[text()='Solutions']") WebElement solutions;
	@FindBy(xpath="//div[text()='Products']") WebElement products;
	@FindBy(xpath="//div[text()='Resources']") WebElement Resources;
	@FindBy(xpath="//a[text()='Summit']") WebElement Summit;

	
	
	
	public void verifyFields() {
    	assertEquals(products.getText(), "Products");
    	//products verified successfully
    	assertEquals(solutions.getText(), "Solutions");
    	//Solutions verified successfully
    	assertEquals(Resources.getText(), "Resources");
    	//Resources verified successfully
    	assertEquals(Summit.getText(), "Summit");
    	//Summit verified successfully
    	
    	
    	
    	
	}
	
	public void verifyPageTitle() {
		//verifying the page title
		String pageTitle = "Property Management Software | Entrata";
		assertEquals(pageTitle, driver.getTitle());
		
		
	}

    public void loginToEntrata(String Usernameforapplication, String PasswordforApplication) throws InterruptedException {
    	
    	String signinbtn = "SIGN IN";
    	Thread.sleep(2000);
    	closeTheCookie.click();
    	signInBtn.click();
    	Thread.sleep(2000);
    	propertyManageeLogin.click();
    	//driver.waitfor
    	username.sendKeys(Usernameforapplication);
    	password.sendKeys(PasswordforApplication);
    	//verifying the sign in btn
    	assertEquals(signinbtn, signInButton.getText());
    	//sign in button verified successfully 
    	driver.getTitle();
    	driver.navigate().back();
    	Thread.sleep(2000);
    	driver.navigate().back();	
    }
    
    
	
}
