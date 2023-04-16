package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Paymentpage extends Utility {
	public WebDriver driver;

	public Paymentpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='card_number']")
	WebElement cardno;
	@FindBy(name = "name_on_card")
	WebElement cardname;
	@FindBy(css = "input.card_exp_month")
	WebElement expmonth;
	@FindBy(css = "input#card_exp_year")
	WebElement expyear;
	@FindBy(name = "security_code")
	WebElement cvvno;

	public void paydetails() {
		//cardno.sendKeys(" 5468-3992-2953-4953");
		cardname.sendKeys(pro.getProperty("cardname"));
		expmonth.sendKeys(pro.getProperty("expmonth"));
		expyear.sendKeys(pro.getProperty("expyear"));
		cvvno.sendKeys(pro.getProperty("cvvno"));
	}

}
