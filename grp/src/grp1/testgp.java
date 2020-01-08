package grp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testgp {
	  WebDriver driver;
	  @BeforeTest (groups= {"smoke"})
	  public void start() {
	  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	  }
	
@Test(groups =  { "smoke" })

public void login_method() {
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8390797320");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Ayu@1596");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	  
	  
}
@Test(groups =  { "smoke"})
	public void test_two() {
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
			driver.findElement(By.xpath("//button[@class='vh79eN']")).click();

}}
