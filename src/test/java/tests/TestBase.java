package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void startriver() {

		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}
	//@AfterSuite
	//public void stopDriver() {
	//	driver.quit();
	//}


}
