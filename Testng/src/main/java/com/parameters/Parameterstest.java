package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterstest {

	WebDriver driver;
	
	  @Test
	  @Parameters({"url", "username" ,"password"})
	  public void logininsta(String url , String username, String password) {
		  
		  
		  System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
			driver =new FirefoxDriver();
		  driver.get(url);
		  
		  
		
		  driver.findElement(By.name("email")).sendKeys(username);
		  driver.findElement(By.name("pass")).sendKeys(password);
		  
		  driver.close();
		  
	  }
	
	
	
	
}
