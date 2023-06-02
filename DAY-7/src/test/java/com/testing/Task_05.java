package com.testing;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_05 {
	WebDriver driver;
  @Test
  @BeforeMethod
  public void TestUrl() {
	  
	  WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		
  }
  @Test
  public void testcase_01(){
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle,"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN" );
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, "https://www.godaddy.com/en-in");
	  driver.quit();
	  }
  
  @Test
  public void testcase_02()
  {

	  WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
}
