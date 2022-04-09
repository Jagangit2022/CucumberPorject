@F_Login
Feature: This feature would be used to design the Login page of the application

  Background: Open the application
    Given I have opened the application in browser

  @Sanity
  Scenario: Validate the successful login
    When I click on the login link
    And I enter username
    And I enter password
    And I click on the login Button
    Then I should be landed on the home page

  @Regression
  Scenario: Validate the successful login using test data
    When I click on the login link
    And I enter username "abc@xyz.com"
    And I enter password "Pqr@1234"
    And I click on the login Button
    Then I should be landed on the home page

  @Regression @Rapid
  Scenario Outline: Validate the successful login using multiple data
    When I click on the login link
    And I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login Button
    Then I should be landed on the home page

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | Pqr@1234 |
      | nfk@xyz.com | Pqr@1234 |

@Negative
  Scenario: Validate the Negative login using test data
    When I click on the login link
    And I enter username "abc@xyz.com"
    And I enter password "Pqr@1234"
    And I click on the login Button
    Then I should get error message as "The email or password you have entered is invalid."
