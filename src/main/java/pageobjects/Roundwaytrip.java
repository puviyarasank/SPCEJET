package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Roundwaytrip extends Utility {
	public WebDriver driver;

	public Roundwaytrip(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class=\"css-1dbjc4n r-zso239\"])[2]")
	WebElement roundbtn;
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement date;
	@FindBy(xpath = "(//div[@class=\"css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu\"])[45]")
	WebElement dobclick;

	@FindBy(xpath = "//div[text()='Select Date']")
	WebElement date2;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passenger;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")
	WebElement adult;
	@FindBy(xpath = "//div[text()='Search Flight']")
	WebElement search;
	@FindBy(css = "div[data-testid=\"continue-search-page-cta\"]")
	WebElement fight;

	public void roundtrip() throws InterruptedException {
		roundbtn.click();
		from.sendKeys("MAA");
		to.sendKeys("BOM");
		date.click();
		date2.click();
		date2.click();
		passenger.click();
		Thread.sleep(2000);
		adult.click();
		//search.click();
//	fight.click();

	}
}
