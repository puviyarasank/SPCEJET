package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utility;

public class Addonpage extends Utility {
	public WebDriver driver;

	public Addonpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[3]")
	WebElement continueclick;
	@FindBy(xpath="(//span[text()='Skip this to skip comfort.'])[1]")
	WebElement skip;

public void addon() throws InterruptedException {
	
//	action("doubleclick", "doubleclick", continueclick);
	action("click", "click", continueclick);

	Thread.sleep(2000);
	action("click", "click", skip);
	
	Thread.sleep(2000);
	//action("click", "click", continueclick);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	continueclick = wait.until(ExpectedConditions
			.elementToBeClickable(continueclick));
//	action("click", "click", continueclick);
	

	
	
	
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("argument[0].click()", continueclick);
//	Thread.sleep(2000);
//	continueclick.click();
	

}
}