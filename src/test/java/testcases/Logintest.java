package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Loginpage;

public class Logintest extends Baseclass {
	@Test
	public static void login() {
		Loginpage lo = new Loginpage(driver);
		lo.loginbtn();
		lo.emailbtn();
		lo.email(pro.getProperty("emailid"));
		lo.password(pro.getProperty("password"));
		lo.login();
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title);
	}
	@Test
public void loginwithinvalidpassword() {
		Loginpage lo = new Loginpage(driver);
		lo.loginbtn();
		lo.emailbtn();
		lo.email(pro.getProperty("emailid"));
		lo.password(pro.getProperty("wrongpassword"));
		lo.login();
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title);
	

}
	@Test
	public void loginwithinvalidmail() {
		Loginpage lo = new Loginpage(driver);
		lo.loginbtn();
		lo.emailbtn();
		lo.email(pro.getProperty("invalidemailid"));
		lo.password(pro.getProperty("password"));
		lo.login();
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title);
		

	}
	@Test
	public void loginwithinvalid_mail_and_pass() {
		Loginpage lo = new Loginpage(driver);
		lo.loginbtn();
		lo.emailbtn();
		lo.email(pro.getProperty("invalidemailid"));
		lo.password(pro.getProperty("wrongpassword"));
		lo.login();
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), title);
	

	}
}
