package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.base.Testbasecls;

public class Loginpage extends Testbasecls{
	
	
	//page factory
	//we have to define page factory or object repository
	//page factory we use one annotation ie. @findby 
	
	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement loginbtn;
	
	
	
	//initializing page objects
	
	public  Loginpage() {
		
		PageFactory.initElements(driver, this);       //page factory is the method we have to intialize our page factory
		
	}
	
	//actions  -means different feature available in login page
	
	public String validatetitle() {
		return driver.getTitle();
		
	}
	
	public String validateurl() {
		return driver.getTitle();
		
	}
	
	
	public Homepage login(String un, String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new Homepage();
	}
	
	
	
	
	
	
	
	

}
