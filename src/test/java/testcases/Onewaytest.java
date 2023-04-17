package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Onewaytrip;
import pageobjects.Paymentpage;

public class Onewaytest extends Baseclass {
	

	@Test
	public void onewaytest() throws InterruptedException {
		Onewaytrip on =new Onewaytrip(driver);

		
		on.from("MAA");
		//Thread.sleep(3000);
		on.to("DEL");
		on.date();
		on.passenger();
		on.adult();
		on .searchfight();
		
		

		Thread.sleep(3000);
		//passengerpage
		Passengerdetailstest.details2();
		Thread.sleep(3000);
		Addontest.addtest();
		Thread.sleep(3000);
		
	
		System.out.println("Booking conformed");
	

		String title = driver.getTitle();
		
		Assert.assertEquals(driver.getTitle(), title);

	}

}
