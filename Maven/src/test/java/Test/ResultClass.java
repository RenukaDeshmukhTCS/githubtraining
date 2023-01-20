package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.baseClass;
import PomClasses.ActiHomePage;
import PomClasses.ActiLoginPage;
import utilityClass.utility;


public class ResultClass extends baseClass {
	//WebDriver driver;
	ActiLoginPage l;
	ActiHomePage hp;
	
	@BeforeClass
	public void openBrowser() {
		initializeBrowser();// we call it directly as we extend base class here // non static to non static call directly
		l = new ActiLoginPage(driver);
		hp = new ActiHomePage( driver);
	}
	@BeforeMethod
	public  void Login() throws Throwable {
		l.enterUN(utility.getTD(0, 0));
		l.enterPWD(utility.getTD(0, 1));
		l.clickLoginBTN();
		
	}
	@Test
	public  void verifyTextOf() throws Throwable {
		Reporter.log("TC verify Test is Running ");
		String act =hp.verifyText();
		String exp =utility.getTD(0, 2);
		Assert.assertEquals(act, exp);
	}
	@AfterMethod
	public static void logout() {
		Reporter.log("logout");
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Closed Browser");
	}

}
