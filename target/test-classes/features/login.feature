Feature: Login Functionality

@Reg
Scenario: login with valid credentials
When user enters "standard_user" and Password "secret_sauce"
And user clicks on login button
Then Validate successful login


@Reg
Scenario: login with invalid credentials
When user enters "invalid_user" and Password "invalid_sauce"
And user clicks on login button
Then validate error message


@Reg
Scenario: login with valid username and invalid password
When user enters "standard_user" and Password "invalid_sauce"
And user clicks on login button
Then validate error message


@Reg
Scenario: login with invalid username and valid password
When user enters "invalid_user" and Password "secret_sauce"
And user clicks on login button
Then validate error message




