package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Addonpage extends Utility {
	public WebDriver driver;

	public Addonpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[3]")
	WebElement continueclick;

public void addon() throws InterruptedException {
	action("click", "click", continueclick);
	Thread.sleep(2000);
	action("doubleclick", "doubleclick", continueclick);;
	

}
}