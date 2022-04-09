Feature: This feature is to design calculator for add and subtract function

  Background: Open the calculator application
    Given I have successfully opened calculator app

  Scenario: Validate addition of two numbers
    When I add 6 and 9
    Then I should see result as 15

  Scenario: Validate subtraction of two numbers
    When I subtract 12 and 9
    Then I should see result as 3

  Scenario Outline: Validate addition of multiple numbers
    When I add <num1> and <num2>
    Then I should see result as <result>

    Examples: 
      | num1 | num2 | result |
      |   10 |   12 |     22 |
      |    3 |    9 |     12 |

  Scenario Outline: Validate subtraction of multiple numbers
    When I subtract <num1> and <num2>
    Then I should see result as <result>

    Examples: 
      | num1 | num2 | result |
      |   18 |   12 |      6 |
      |   22 |    9 |     13 |

  Scenario: Add multiple numbers using cucumber data table
    When I add below numbers
      | 4 |
      | 5 |
      | 7 |
      | 8 |
    Then I should see result as 24

  Scenario: Add multiple numbers using cucumber list
    When I add below numbers using list
      |  4 |
      |  5 |
      |  7 |
      |  8 |
      | 10 |
    Then I should see result as 34

  Scenario: To calculate the total bill of the order
    When I order below items
      | coffee | 27 |
      | Tea    | 23 |
      | burger | 50 |
    Then I should see result as 100

  Scenario: To calculate the total bill of the order
    When I order below items and quantity
      | coffee | 1 | 10 |
      | Tea    | 2 | 20 |
      | burger | 3 | 30 |
    Then I should see result as 140
