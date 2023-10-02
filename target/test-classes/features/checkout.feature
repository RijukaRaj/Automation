@Reg
Feature: Checkout Functionality

Scenario: checkout with valid firstname lastname and postalcode
When user enters "standard_user" and Password "secret_sauce"
And user clicks on login button
And user clicks on add to cart button
Then validate cart count is "1"
And User navigates to checkout page
And User enters personal details "Test" "Automation" "201301"
And User clicks on Continue button
Then Validate user navigates to checkout two page
