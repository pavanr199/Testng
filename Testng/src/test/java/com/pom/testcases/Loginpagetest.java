package com.pom.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.base.Testbasecls;
import com.pom.pages.Homepage;
import com.pom.pages.Loginpage;

public class Loginpagetest extends Testbasecls {

	Loginpage loginpage;
	Homepage homepage;
	
	  public  Loginpagetest() {
		  
		  super();
		  
	  }
	
	
	
	
	
	
	@BeforeMethod
	public void setup() {
		
		intialization();
		
		 loginpage=new Loginpage();
		
		
		
	}
	
	@Test(priority=1)
	public void verifyloginpagetitletest() {
		
		String title =loginpage.validatetitle();
		System.out.println(title);
	}
	
	
	@Test(priority=2)
	public void verifyurltest() {
		
		String urll= loginpage.validateurl();	
		System.out.println(urll);
	}
	
	
	@Test(priority=3)
	public void loogintest() {
		homepage =loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
}
