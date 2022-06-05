package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageBase {
	

	public AccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[2]")
	WebElement depositbtn;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/div/input")
	WebElement depositfield;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/button")
	WebElement dodeposit;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[3]")
	WebElement withdrawbtn;
	

	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/div/input")
	WebElement withdrawfield;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[4]/div/form/button")
	WebElement dowithdraw;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/strong[2]")
	public
	WebElement balance;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div/div[3]/button[1]")
	WebElement transaction;

	public void accountTransactions() throws InterruptedException {
		depositbtn.click();
		Thread.sleep(2000);
		depositfield.sendKeys("1000");
		Thread.sleep(2000);
		dodeposit.click();
		Thread.sleep(2000);
		withdrawbtn.click();
		Thread.sleep(2000);
		withdrawfield.sendKeys("400");
		Thread.sleep(2000);
		dowithdraw.click();
		Thread.sleep(2000);
		transaction.click();

		
		

	}

}
