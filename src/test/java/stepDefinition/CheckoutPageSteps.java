package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;

public class CheckoutPageSteps {
	
	CheckoutPage checkout= new CheckoutPage();

	@Then("User enters personal details {string} {string} {string}")
	public void user_enters_personal_details(String fname, String lname, String pcode) {
		checkout.user_enters_personal_details(fname, lname, pcode);
	 
	}

	@And("User clicks on Continue button")
	public void User_clicks_on_Continue_button() {
		checkout.clickonContinueButton();
	}

	@Then ("Validate user navigates to checkout two page")
	public void Validate_user_navigates_to_checkout_two_page(){
		checkout.Validate_user_navigates_to_checkout_two_page();
	}
}
