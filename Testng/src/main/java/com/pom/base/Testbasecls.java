package com.pom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbasecls {

	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public  Testbasecls() {
		
		
		 prop=new Properties();
		
	try {
		FileInputStream ip =new FileInputStream("G:/Eclipselatest/Testng/src/main/java/com/pom/envirment/config.properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
		
		
	}
	
	
	
	public static void intialization() {
		
		String browsename=prop.getProperty("browser");
		
		if(browsename.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
			driver =new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
