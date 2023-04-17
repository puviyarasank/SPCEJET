package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Passengerdetails;

public class Passengerdetailstest extends Baseclass {
	

	
	@Test
	public static void details2() throws InterruptedException {
		Passengerdetails pass = new Passengerdetails(driver);
		pass.block1();
		Thread.sleep(2000);
		pass.passenger();
	
		pass.passenger2();
		
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title);

		
	}

}
