package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onewaytrip {
	public WebDriver driver;

	public Onewaytrip(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "circle[stroke='#F7941D']")
	WebElement onewaybtn;
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;
	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement date;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'])[45]")
     WebElement dobclick;
	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]")
	WebElement passengers;
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")
	WebElement adult;
	@FindBy(css = "div[data-testid='home-page-flight-cta']")
	WebElement searchfight;
	@FindBy(css = "div[data-testid='continue-search-page-cta']")
	WebElement fight;

	public void oneway() {
		onewaybtn.click();
	}

	public void from(String locfrom) throws InterruptedException {
		//Thread.sleep(3000);
		from.sendKeys(locfrom);
	}

	public void to(String locto) {
		to.sendKeys(locto);
	}
	public void date() throws InterruptedException {
		date.click();
//		Thread.sleep(3000);
//		dobclick.click();

	}

	public void passenger() {
		passengers.click();
	}

	public void adult() {
		adult.click();
	}

	public void searchfight() {
		searchfight.click();
		fight.click();
		

	}

}
