package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationcount {




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

                                                 //USING INVOCATION COUNT

	@Test(priority=2,invocationCount=3)
	public void title() {

		String ptitle =driver.getTitle();
		System.out.println("demotitle is " +ptitle);


	}

	@Test(priority=1)
	public void url() {

		String purl =driver.getCurrentUrl();
		System.out.println("demourl is " +purl);
	}


	@AfterMethod
	public void teardown() {

		driver.close();
	}






}
