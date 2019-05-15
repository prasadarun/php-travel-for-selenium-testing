package com.projectname.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectname.qa.base.TestBase;
import com.projectname.qa.utility.Loadingtime;

public class HomePage extends TestBase{
	
	HomePage homepage;
	

	@FindBy(linkText = "Search by Hotel or City Name")
	WebElement hotel;
	
	@FindBy(xpath = "//span[contains(text(),'Flights')]")
	WebElement flights;
	
	
	@FindBy(xpath = "//span[contains(text(),'Tours')]")
	WebElement tours;
	
	
	@FindBy(xpath = "//span[contains(text(),'Cars')]")
	WebElement cars;
	
	
	@FindBy(xpath = "//li[@class='text-center go-right']//a[contains(text(),'Offers')]")
	WebElement offers;
	
	
	@FindBy(xpath = "//a[contains(text(),'Blog')]")
	WebElement blog;
	

	
	@FindBy(xpath = "//a[@class='navbar-brand go-right']//img")
	WebElement logo;
	
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]")
	WebElement Myaccount;
	
	
	
	// Page Factor
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean ValidationOfOffers() {
	  offers.click();
	  boolean flag = offers.isSelected();
	  return flag;
	 
	}
	
	
	public boolean validationOfBlog() throws InterruptedException {
	 blog.click();
	 boolean flag =  blog.isSelected();
	 return flag;
		
		
	}
	
	
	public HotelsPage ValidateHotels() throws InterruptedException {
		hotel.click();
		return new HotelsPage();			
		
	}
	
	
	
	public ToursPage ValidateTour() throws InterruptedException {
		Thread.sleep(2000);
		tours.click();
		return new ToursPage();
		
	}
	
	
	public FlightsPage ValidateFlights() {
		driver.manage().timeouts().implicitlyWait(Loadingtime.IMPLICT_WAIT, TimeUnit.SECONDS);
		flights.click();
		return new FlightsPage();
		
	}
	
	
	public CarsPage ValidateCars() {
		driver.manage().timeouts().implicitlyWait(Loadingtime.IMPLICT_WAIT, TimeUnit.SECONDS);
		cars.click();
		return new CarsPage();	
	}
	
	
	public String titleofpage() {
		return driver.getTitle();
	}
	
	
	public boolean validateMyaccount() {
		driver.manage().timeouts().implicitlyWait(Loadingtime.IMPLICT_WAIT, TimeUnit.SECONDS);
		Myaccount.click();
		boolean flag = Myaccount.isSelected();
		return flag;
	}
	


	
	
	
	

	
	
}
	
