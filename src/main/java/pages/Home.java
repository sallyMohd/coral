package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends PageBase
{

	public Home(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[1]/button")
	WebElement loginbtn;
	
	public void userLogin() {
		loginbtn.click();
		
	}

}
