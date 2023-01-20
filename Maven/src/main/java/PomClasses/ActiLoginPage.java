package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginPage {
	@FindBy(xpath="//input[@type='text']") WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement PWD;
	@FindBy(xpath="//div[text()='Login ']") WebElement LGNBTN;


	//initialization
	public ActiLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUN(String username) {
		UN.sendKeys(username);
		
	}
	public void enterPWD(String password) {
		PWD.sendKeys(password);
	}
	public void clickLoginBTN() {
		LGNBTN.click();
	}

}
