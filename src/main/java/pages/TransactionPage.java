package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TransactionPage extends PageBase {

	public TransactionPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[3]")
	public
	WebElement transtype;
	
	public void checktype() {
		transtype.isDisplayed();
		
		
	}

}
