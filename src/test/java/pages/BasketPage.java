package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;


public class BasketPage extends Base{
	
	public void clickonAddtoCart() {
		
		WebElement addToCartBtn= driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack"));
		clickonElement(addToCartBtn);
		
	}

	 public void validateCartCount(String count) {
		WebElement cartCount= driver.findElement(By.cssSelector("span.shopping_cart_badge"));
		 String cartValue= cartCount.getText();
		 Assert.assertEquals(count, cartValue);
		 System.out.println("Added to cart");
		 
	 }
	 
	 public void User_navigates_to_checkout_page() {
		WebElement cartLink= driver.findElement(By.cssSelector("a.shopping_cart_link"));
		clickonElement(cartLink);
		
		
		WebElement checkoutBtn= driver.findElement(By.cssSelector("button#checkout"));
	    clickonElement(checkoutBtn);
	 }
}



