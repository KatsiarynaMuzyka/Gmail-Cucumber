package by.epam.gmail.automation.runner;

import by.epam.gmail.automation.pages.*;
import by.epam.gmail.automation.utils.JavaRobot;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" }, 
				glue = "by.epam.gmail.automation", 
				features = "classpath:cucumber/gmail.feature")

public class RunGmailTest {
	protected static WebDriver driver;
	protected LoginPage loginPage = new LoginPage(driver);
	protected ConfirmationPage confirmationPage = new ConfirmationPage(driver);
	protected ForwardPopImapSettingsPage forwardPopImapSettingsPage = new ForwardPopImapSettingsPage(driver);
	protected HomePage homePage = new HomePage(driver);
	protected GeneralSettingsPage generalSettingsPage = new GeneralSettingsPage(driver);
	protected ThemesPage themesPage = new ThemesPage(driver);
	protected MessagePage messagePage = new MessagePage(driver);
	protected SpamPage spamPage = new SpamPage(driver);
	protected SwitchUserPage switchUserPage = new SwitchUserPage(driver);
	protected TrashPage trashPage = new TrashPage(driver);

	@BeforeClass
	public static void beforeClass() {
		 JavaRobot.createSpecialFile("C:\\Users\\Katsiaryna_Muzyka",
		 "photo.txt", 2);
		 JavaRobot.createSpecialFile("C:\\Users\\Katsiaryna_Muzyka",
		 "file.txt", 30);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Katsiaryna_Muzyka\\Desktop\\Gmail-master\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void afterClass() {
		driver.close();
		// JavaRobot.deleteFile("C:\\Users\\Katsiaryna_Muzyka", "photo.txt");
		// JavaRobot.deleteFile("C:\\Users\\Katsiaryna_Muzyka", "file.txt");
	}

}
