Feature: Basket Functionality

Background: user navigates to Swag Labs application
When user enters "standard_user" and Password "secret_sauce"
And user clicks on login button


@Reg
Scenario: Verify user is able to add the product into the basket
And user clicks on add to cart button
Then validate cart count is "1"