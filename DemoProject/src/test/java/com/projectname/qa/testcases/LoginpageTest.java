package com.projectname.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.projectname.qa.base.TestBase;
import com.projectname.qa.pages.LoginPage;



public class LoginpageTest extends TestBase {
	
	LoginPage loginpage;
	
		
	public LoginpageTest() {
		super();
		
	}
	

	@BeforeMethod
	public void setUp() {
		intilization();
	    loginpage = new LoginPage();
	}
	
	
	
	
	

	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
}