package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Roundwaytrip;

public class Roundtriptest extends Baseclass {
	@Test
	public void roundtest() throws InterruptedException {
		Roundwaytrip ro = new Roundwaytrip(driver);
		ro.roundtrip();
		Passengerdetailstest.details2();
		Addontest.addtest();
		System.out.println("booking conformed");

	}

}
