package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside - step - user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside - step - user_enters_username_and_password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside - step - clicks_on_login_button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside - step - user_is_navigated_to_the_home_page");
	}

	@When("user enters user1 and password1")
	public void user_enters_user1_and_password1() {
		System.out.println("Inside - step - user_enters_user1_and_password1");
	}

	@And("user enters user2 and password2")
	public void user_enters_user2_and_password2() {
		System.out.println("Inside - step - user_enters_user2_and_password2");
	}

}
