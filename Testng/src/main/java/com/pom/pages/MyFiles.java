package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFiles {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
		driver =new FirefoxDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.id("menu_dashboard_index")).click();
		
		//driver.findElement(By.xpath("//a[contains(@href,'My Info')]")).click();
		System.out.println("open page successfully");
      driver.close();
	}

}
