package com.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipcart {
WebDriver driver;
	
	
	public void Testone() {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	}
	
}
