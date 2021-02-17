package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsTestng {

 /*
	@BeforeSuite--setup system property for chrome -1
	@BeforeTest--launch the browser                -2
	@BeforeClass--login in to ap                   -3
	
	@BeforeMethod--enter url                       
	@Test--google logo text                        
	@AfterMethod--log out to app
	
	@BeforeMethod--enter url
	@Test--google search text
	@AfterMethod--log out to app
	
	@BeforeMethod--enter url
	@Test--google title text
	@AfterMethod--log out to app
	
	@AfterClass--close the browser
	@AfterTest--deleteallcookies
	
*/	

	
	//pre conditions -starting with @before
	
	@BeforeSuite //1
	public void setup() {

		System.out.println("@BeforeSuite--setup system property for chrome");
	}

	@BeforeTest //2
	public void launchbrowser() {

		System.out.println("@BeforeTest--launch the browser");
	}
	
	
	@BeforeClass  //3
	public void login() {

		System.out.println("@BeforeClass--login in to ap");

	}


	@BeforeMethod //4
	public void enterurl() {

		System.out.println("@BeforeMethod--enter url");
	}


	
	/*  @beforemethod
	 * @test-1
	 * @aftermethod
	 * 
	 * @beforemethod
	 * @test-2
	 * @aftermethod
	 * 
	  
	 * 
	 */
	
	
	
	//---------------------------------------------

	
	@Test  //5
	public void titletext() {

		System.out.println("@Test--google title text");
	}

	@Test  
	public void searchtext() {

		System.out.println("@Test--google search text");
	}
	
	@Test  
	public void logotext() {

		System.out.println("@Test--google logo text");
	}

	//------------------------------------------------

	 //post conditions starts with @after

	@AfterMethod  //6
	public void logout() {

		System.out.println("@AfterMethod--log out to app");
	}


	@AfterTest  //8
	public void deleteallcookies() {

		System.out.println("@AfterTest--deleteallcookies");
	}


	@AfterClass  //7
	public void closebrowser() {

		System.out.println("@AfterClass--close the browser");

	}


	



}
