package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Passengerdetails extends Utility {
	public WebDriver driver;

	public Passengerdetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@data-testid='title-contact-detail-card']")
	WebElement title;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement firstname;
	@FindBy(css = "input[data-testid='last-inputbox-contact-details']")
	WebElement lastname;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement mobnum;
	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
	WebElement email;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[5]")
	WebElement primarypassenger;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1uavh4e r-z2wwpe r-d9fdf6 r-9qu9m4'])[2]")
	WebElement passenger2;
	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-poiln3 r-ubezar r-j2kj52'])[2]")
	WebElement title2;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement firstname2;
	@FindBy(xpath = "(//input[@autocomplete='new-password'])[7]")
	WebElement lastname2;
	@FindBy(xpath = "(//input[@autocomplete='new-password'])[8]")
	WebElement mobilenum2;
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement continueclick;
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[3]")
	WebElement click;
	

	public void block1() throws InterruptedException {
		//select(title, "Mr", "vis");
		firstname.sendKeys(pro.getProperty("firstname"));
		Thread.sleep(1000);
		lastname.sendKeys(pro.getProperty("lastname"));
		mobnum.sendKeys(pro.getProperty("mobilenum"));
		email.sendKeys(pro.getProperty("emailid"));

	}

	public void passenger() throws InterruptedException {
	scrolldown();
		Thread.sleep(3000);
		
		primarypassenger.click();
		

	}

	public void passenger2() throws InterruptedException {
          Thread.sleep(3000);
		
		
		passenger2.click();
		//select(title2, "Mr", "vis");
		
		firstname2.sendKeys("ezhilarasan");
		lastname2.sendKeys("k");
		mobilenum2.sendKeys(pro.getProperty("mobilenum"));
		Thread.sleep(2000);
		continueclick.click();
		Thread.sleep(2000);
//		action("click", "click", click);
//		Thread.sleep(2000);
//		action("doubleclick", "doubleclick", click);
		
	}

}
