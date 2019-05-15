package com.projectname.qa.testcases;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.projectname.qa.base.TestBase;
import com.projectname.qa.pages.CarsPage;
import com.projectname.qa.pages.FlightsPage;
import com.projectname.qa.pages.HomePage;
import com.projectname.qa.pages.HotelsPage;
import com.projectname.qa.pages.ToursPage;

public class HomepageTest extends TestBase {
	
HomePage homepage;

HotelsPage hotelpage;

FlightsPage flightspage;

ToursPage tourspage;

CarsPage carspage;



	
	public HomepageTest() {
		super();
	}
	
	
	@BeforeMethod
	
	public void setUp() {
		
		intilization();
		homepage = new HomePage();	
	}

     
   


     @Test
     
     public void validateblogTest() throws InterruptedException  {
        homepage.validationOfBlog();
}	


    @Test 
    
    public void validatetitleofpageTest() {
     homepage.titleofpage();

}

     @Test
      public void validatehotelpageTest() throws Exception {
	  hotelpage =  homepage.ValidateHotels();	
 }

     
     @Test
     public void validateofferTest() {
    	 homepage.ValidationOfOffers();
     }

     
     
 
   @AfterMethod
    public void tearDown() {
     driver.quit();
	}
	
	
	

}
