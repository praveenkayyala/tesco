Feature: invalid data




  @invalidlogin
  Scenario Outline:customer invalid data login
    Given customer on navigate to the Login Page
    When am enter the "<Email>" and "<Password>"
    And am press on to the LOGIN Button
    Then I should able to see error message "<Error>"
    Examples:
      | Email             | Password | Error                  |
      | hkgkagk@gmail.com | 11452    | Login was unsuccessful |
      | rajj@gmail.com    |          | Login was unsuccessful |

  @blankemail
  Scenario Outline: Customer enter BlankEmail
    Given am on navigate to the Login Page
    When customer enter the "<BlankEmail>" and "<Password>"
    And customer press on to the LOGIN Button
    Then customer should able to see error message "<Error>"
    Examples:
      | BlankEmail | Password | Error                   |
      |            | 124568   | Please enter your email |

