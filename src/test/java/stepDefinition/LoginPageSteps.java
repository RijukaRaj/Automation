package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

	LoginPage login=new LoginPage();
	
	
	@When("user enters {string} and Password {string}")
	public void user_enters_and_password(String username, String pass) {
     login.user_enters_and_password(username, pass);
	
	}

  @When("user clicks on login button")
	public void user_clicks_on_login_button() {
	login.user_clicks_on_login_button();
}

   @Then("Validate successful login")
   public void validate_successful_login() {
    
}

   @Then ("validate error message")
    public void validate_error_message() {
	login.Validate_error_message();
 }

}
