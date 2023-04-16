package testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Paymentpage;

public class Paymenttest extends Baseclass{
	
	@Test
	public static void payment() {
		Paymentpage te = new Paymentpage(driver);
		te.paydetails();
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title);
		
	} 



}
