package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Addonpage;

public class Addontest extends Baseclass {
	@Test
	public  static void addtest() throws InterruptedException {
		Addonpage add = new Addonpage(driver);
		add.addon();
		Thread.sleep(3000);
	
		
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title);

	}

}
