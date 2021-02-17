package com.testng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValiedateTitle {


	WebDriver driver;


	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
		driver =new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);

		driver.get("https://www.instagram.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//validate title using TESTNG  assertaions                              

	@Test()
	public void title1() {

		String ptitle =driver.getTitle();
		System.out.println("demotitle is " +ptitle);


		Assert.assertEquals(ptitle, "Register", "the title is not matched");

	}


	@AfterMethod
	public void teardown() {

		driver.quit();
	}






}
