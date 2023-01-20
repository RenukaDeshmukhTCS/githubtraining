package PomClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiHomePage {
@FindBy(xpath = "//td[text()='Enter Time-Track']") WebElement text;
public ActiHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public String verifyText() {
	String act = text.getText();
	return act;
}
}
