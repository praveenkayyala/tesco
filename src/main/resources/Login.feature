Feature: Customer Login

  @login
  Scenario Outline:Customer should able to Login Page
    Given I am on navigate to the Login Page
    When I am enter the "<Email>" and "<Password>"
    And I am press on to the LOGIN Button
    Then I should able to logedin Successfuly
    Examples:
      | Email        | Password |
      | qq@gmail.com | qqqqqq   |
      | zz@gmail.com | zzzzzz   |