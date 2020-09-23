package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		System.out.println("Enter valid username and password");
	}

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Click on login button");
	}

	@Then("User navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("User is on home page");
	}
}
