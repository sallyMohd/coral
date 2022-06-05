package tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import pages.AccountPage;
import pages.Home;
import pages.SelectNamePage;
import pages.TransactionPage;

public class UserLogin extends TestBase{
	
	Home homeobject;
	SelectNamePage nameobject;
	AccountPage accountobject;
	TransactionPage transobject;
	
	@Test
	public void Userclicksonlogin() throws InterruptedException {
		
		homeobject = new Home(driver);
		homeobject.userLogin();
		
		nameobject = new SelectNamePage(driver);
		nameobject.userclicksmenu();
		
		accountobject = new AccountPage(driver);
		accountobject.accountTransactions();
		
		String value1= accountobject.balance.getText();
	
		Assert.assertEquals("600", value1);
		
		transobject = new TransactionPage(driver);
		transobject.checktype();
		
		String value2= transobject.transtype.getText();
		Assert.assertEquals("Debit", value2);
		
	
		
		
		
		
	}

}
