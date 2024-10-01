package com.entrata.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.entrata.utilities.Browserfactory;
import com.entrata.utilities.ConfigDataProvider;

public class entrataBaseClass {
	public WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpsuite() {
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void startTheBrowser() 
	{
		driver = Browserfactory.startBrowser(driver, config.getBrowser(), config.getappUrl());
	}
	
	
	@AfterClass
	public void closetheBrowser() 
	{
		Browserfactory.quiteBrowser(driver);
	}
	

}
