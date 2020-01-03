package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mavenselenium {

	WebDriver driver;
	
	@BeforeTest
	public void Testone() {
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void Testtwo() {
		driver.findElement(By.id("email")).sendKeys("ajinkyadoke284@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("u_0_2")).click();
		
		
	}
}
