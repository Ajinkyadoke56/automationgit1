package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class one {
	WebDriver driver;
@BeforeTest
	public void maven() {
		
	System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/login");
	System.out.println("ajinkya");

}
@Test
public void myntra() {
	
	driver.findElement(By.name("email")).sendKeys("ajinkyadoke284@gmail.com");
	driver.findElement(By.name("password")).sendKeys("805560414243");
	driver.findElement(By.className("login-login-button")).click();
	//desktop-searchBar
	driver.findElement(By.className("desktop-searchBar")).sendKeys("mobile phones");
	driver.findElement(By.className("desktop-submit")).click();
}
}
