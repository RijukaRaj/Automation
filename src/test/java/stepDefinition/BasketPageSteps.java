package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasketPage;

public class BasketPageSteps {
	
	BasketPage basket= new BasketPage();
	
	
	@And("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		basket.clickonAddtoCart();
	}
	
	@Then ("validate cart count is {string}")
	public void validate_cart_count(String count) {
		basket.validateCartCount(count);
		
	}
	
	@And ("User navigates to checkout page")
	public void User_navigates_to_checkout_page() {
		basket.User_navigates_to_checkout_page();
		
	}
	

}
