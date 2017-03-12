package by.epam.gmail.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

	@FindBy(id = "Email")
	private WebElement loginField;
	
	@FindBy(id = "next")
	private WebElement nextButton;
	
	@FindBy(id = "Passwd")
	private WebElement passwordField;
	
	@FindBy(id = "signIn")
	private WebElement signInButton;

	public LoginPage(WebDriver driver) {
		super(driver);
	}


	private void fillEmailField(String email) {
		loginField.click();
		loginField.clear();
		loginField.sendKeys(email);
		nextButton.click();
	}
	
	private void fillPasswordField(String password) {
		wait.waitForElementIsClickable(passwordField);
		passwordField.click();
		passwordField.sendKeys(password);
		signInButton.click();

	}
	
	public void authorization(String email, String password) {
		fillEmailField(email);
		fillPasswordField(password);
	}
	
	public void goToLoginPage(){
		driver.get("https://gmail.com");
	}
}
