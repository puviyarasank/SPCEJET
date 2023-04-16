package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Onewaytrip;

public class Onewaytest extends Baseclass {
	@Test
	public void onewaytest() throws InterruptedException {
		//Logintest.login();
	//	Thread.sleep(4000);

		Onewaytrip on = new Onewaytrip(driver);

		on.from("MAA");
		Thread.sleep(3000);
		on.to("DEL");
		on.date();
		on.passenger();
		on.adult();
		on.searchfight();

	
//		//passengerpage
	Passengerdetailstest.details();
	Addontest.addtest();
//		//paymentpage
	Paymenttest.payment();
//
//		String title = driver.getTitle();
//		Assert.assertEquals(driver.getTitle(), title);
	}

	@Test
	public void onewaytestwithoutlogin() throws InterruptedException {
		Onewaytrip on = new Onewaytrip(driver);
		// on.oneway();
		on.from("MAA");
		Thread.sleep(3000);
		on.to("DEL");

		on.date();

		on.passenger();
		on.adult();
		on.searchfight();

		Thread.sleep(3000);
		//passengerpage
		Passengerdetailstest.details2();
		Thread.sleep(3000);
		Addontest.addtest();
		//paymentpage
	Paymenttest.payment();
	

		String title = driver.getTitle();
		
		Assert.assertEquals(driver.getTitle(), title);

	}

}
