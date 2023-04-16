package testcases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Signup;

public class Signuptest extends Baseclass {
	@Test
	public void signuppage() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//div[text()='Signup']")).click();
		switchwindow();
		Signup sign = new Signup(driver);
		sign.signuppage();
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title);
	
		

	}
}
