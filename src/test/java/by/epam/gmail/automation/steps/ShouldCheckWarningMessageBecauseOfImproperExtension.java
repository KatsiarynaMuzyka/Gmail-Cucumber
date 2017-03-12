package by.epam.gmail.automation.steps;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import by.epam.gmail.automation.runner.RunGmailTest;
import by.epam.gmail.automation.utils.JavaRobot;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShouldCheckWarningMessageBecauseOfImproperExtension extends RunGmailTest {

	/*@When("^JavaRobot create file of improper extension with filepath \"([^\"]*)\" and filename \"([^\"]*)\"$")
	public void createFile(String filepath, String filename) {
		JavaRobot.createFileOfImproperExtension(filepath, filename);
	}*/
	
	@When("^User navigate to settings page$")
	public void navigateToSettingsPage() {
		homePage.goToSettingsPage();
	}
	
	@When("^User navigate to theme page$")
	public void navigateToThemePage() {
		generalSettingsPage.goToThemesPage();
	}

	@When("^User select photo \"([^\"]*)\" from computer$")
	public void selectPhotoFromComputer(String photoName) {
		themesPage.selectPhotosFromComputer(photoName);
	}

	@Then("^User see warning message$")
	public void checkWarningMessage(){
		Assert.assertTrue(themesPage.checkWarningMessage());
	}

}
