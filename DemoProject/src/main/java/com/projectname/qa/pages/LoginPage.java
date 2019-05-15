package com.projectname.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectname.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory
	

	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")
	WebElement My_Account;
	
	@FindBy(name = "Login")
	WebElement Login;
	
	
	
	
	//intializing the page objects 
	public void Loginpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Action
	
	

	public boolean Validatemyaccount() {
		 return My_Account.isSelected();
	}

	
	
	
	
	

}
