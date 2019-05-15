package com.projectname.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectname.qa.base.TestBase;


public class HotelsPage extends TestBase {
	
	HomePage homepage;
	Actions actions = new Actions(driver);
	WebElement elementLocator;

	
	
	@FindBy(xpath
			= "//*[@id=\"hotels\"]/form")
	WebElement searchhotel;
	
	
	@FindBy(xpath = "div[contains(text(),' India')]//span[contains(text(),'Delhi')]")
	WebElement selectdropdown;
	
	
//	@FindBy(xpath = "//div[@id='dpd1']//i[@class='iconspane-lg icon_set_1_icon-53']")
//	WebElement checkin;
	
	
//	@FindBy(xpath = "//input[@placeholder='Check out']")
//	WebElement checkout;
//	
	
	
	@FindBy(xpath = "//button[@id='adultPlusBtn']//i[contains(@class,'fa fa-plus')]")
	WebElement adults;
	
	@FindBy(xpath = "//input[@id='travellersInput']")
	WebElement childs;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-lg btn-block btn-primary pfb0 loader')]//i[contains(@class,'icon_set_1_icon-66')]")
	WebElement searchbtn;
	
	
	public void Hotelpage() {
		PageFactory.initElements(driver, this);
		
	}
	


	public void validatesearchHotel() throws Exception {
		Thread.sleep(2000);
		searchhotel.click();
		Thread.sleep(2000);
		searchhotel.sendKeys("Delhi");
		Thread.sleep(2000);
		selectdropdown.click();
		
	}
	
	

	
	
	public void validatesearchbtn() throws InterruptedException {
		Thread.sleep(2000);
		searchbtn.click();
	}





	public void validatenoofpng() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
	    elementLocator = adults;
		actions.doubleClick(elementLocator).perform();
		Thread.sleep(2000);
		elementLocator = childs;
		actions.doubleClick(elementLocator).perform();
		Thread.sleep(2000);	
		
	}










}
