package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectNamePage extends PageBase
{

	public SelectNamePage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/form/div/select")
	WebElement menu;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/form/button")
	WebElement loguser;
	
	public void userclicksmenu() {
		
		Select user = new Select(menu);
	     user.selectByValue("4");
	     
	     loguser.click();
		
	}

}
