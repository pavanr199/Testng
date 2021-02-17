package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletitle {


	WebDriver driver;


	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
		driver =new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

                                   //USING PRIORITY AND GROUPS KEY WORDS

	@Test(priority=2,groups="title")
	public void title() {

		String ptitle =driver.getTitle();
		System.out.println("demotitle is " +ptitle);


	}

	@Test(priority=1,groups="url")
	public void url() {

		String purl =driver.getCurrentUrl();
		System.out.println("demourl is " +purl);
	}


	@Test(groups="isselected")
	public void display() {

		driver.findElement(By.id("checkbox1")).click();
		boolean select = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println(select);
	}



	@AfterMethod
	public void teardown() {

		driver.close();
	}




}
