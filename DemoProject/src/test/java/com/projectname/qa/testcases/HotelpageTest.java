package com.projectname.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.projectname.qa.base.TestBase;
import com.projectname.qa.pages.HomePage;
import com.projectname.qa.pages.HotelsPage;

public class HotelpageTest extends TestBase {
	
	HomePage homepage;
	HotelsPage hotelpage;
	
	
	public HotelpageTest() {
		super();
	}
	
	
@BeforeMethod
	
	public void setUp() {
		
		intilization();
		
		homepage  = new HomePage();
		hotelpage = new HotelsPage();
		
	}



@Test

public void vaidatesearchhotelTest() throws Exception {
	hotelpage.validatesearchHotel();
}


@Test

public void validatenofpngTest() throws Exception {
	hotelpage.validatenoofpng();
}


@Test

public void validatesearchbtn() throws InterruptedException {
	hotelpage.validatesearchbtn();
}



@AfterMethod
 public void tearDown() {
 driver.quit();
}

	
	
	

}
