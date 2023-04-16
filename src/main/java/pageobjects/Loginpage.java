package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "div[class=\'css-76zvg2 r-jwli3a r-ubezar\']")
	WebElement loginbtn;
	@FindBy(xpath = "(//div[@class=\'css-1dbjc4n r-zso239\'])[4]")
	WebElement emailbtn;
	@FindBy(css = "input[type='email']")
	WebElement email;
	@FindBy(css = "input[type='password']")
	WebElement password;
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement login;

	public void loginbtn() {
		loginbtn.click();
	}

	public void emailbtn() {
		emailbtn.click();
	}

	public void email(String mail) {
		email.sendKeys(mail);
	}

	public void password(String pass) {
		password.sendKeys(pass);
	}

	public void login() {
		login.click();

	}
}
