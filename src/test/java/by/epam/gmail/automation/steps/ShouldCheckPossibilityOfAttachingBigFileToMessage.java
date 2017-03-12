package by.epam.gmail.automation.steps;

import by.epam.gmail.automation.runner.RunGmailTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class ShouldCheckPossibilityOfAttachingBigFileToMessage extends RunGmailTest {

	@When("^User send message with attachment over than 25 MB to another user with email \"([^\"]*)\",\"([^\"]*)\"$")
	public void sendMessageWithAttachment(String email, String filename) {
		homePage.sendMessageWithAttach(email, filename);
	}

	@Then("^User see warning message that size of file over than 25 MB$")
	public void checkWarningMessageThatSizeOfFileIsOver25MB() {
		Assert.assertTrue(homePage.checkWarningMessageThatSizeOfFileIsOver25MB());
	}
	
	
}
