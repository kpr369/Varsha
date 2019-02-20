package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RediffmailLogin {
	
	public static WebDriver driver = new ChromeDriver();
	
	@Given("^I open browser and navigate to rediff mail$")
	public void i_open_browser_and_navigate_to_rediff_mail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^i enter invalid kpr(\\d+) and <passowrd>$")
	public void i_enter_invalid_kpr_and_passowrd(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^i clik on Login Button$")
	public void i_clik_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Login get fail and error message should display$")
	public void login_get_fail_and_error_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
