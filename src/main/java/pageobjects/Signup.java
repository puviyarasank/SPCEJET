package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Signup extends Utility {
	public WebDriver driver;

	public Signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "select[class='form-control form-select ']")
	WebElement title;
	@FindBy(id = "first_name")
	WebElement firstname;
	@FindBy(id = "last_name")
	WebElement lastname;
	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement country;
	@FindBy(id = "dobDate")
	WebElement dob;
	@FindBy(xpath = "//input[@class=' form-control']")
	WebElement mobnum;
	@FindBy(xpath = "(//input[@class='form-control '])[3]")
	WebElement mailid;
	@FindBy(id = "new-password")
	WebElement password;
	@FindBy(id = "c-password")
	WebElement conformpassword;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement btn;
	@FindBy(xpath = "//button[@class='btn btn-red']")
	WebElement submitbtn;

	public void signuppage() throws InterruptedException {
		select(title, "Mr", "vis");
		firstname.sendKeys(pro.getProperty("firstname"));
		lastname.sendKeys(pro.getProperty("lastname"));
		select(country, "India", "vis");
		dob.sendKeys(pro.getProperty("dob"));
		mailid.sendKeys("puviyarasan2096@gmail.com");

		mobnum.sendKeys(pro.getProperty("mobilenum"));

		Thread.sleep(3000);
		password.sendKeys(pro.getProperty("password"));

		conformpassword.sendKeys(pro.getProperty("conformpassword"));
		

	}

}
