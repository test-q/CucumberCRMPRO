package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagStep {

	@Given("app open")
	public void app_open() {
	   System.out.println("App open");
	}

	@When("Enter Tag")
	public void enter_Tag() {
	  System.out.println("Enter tag");
	}

	@Then("check for tag")
	public void check_for_tag() {
	   System.out.println("Check for tag");
	}
	
	@When("^Enter enter data (.*) and (.*)$")
	public void enter_enter_data_batchautomation_and_Test(String username, String password) {
	   System.out.println("Username: " + username);
	   System.out.println("Password: " + password);
	}
}
