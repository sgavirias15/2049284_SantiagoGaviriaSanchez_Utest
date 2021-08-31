#author: Santiago Gaviria Sánchez

Feature: As a user, i want to validate that the page allows a registered user to log in.

  Background:
    Given that the user is on the utest main page
    When the user selects the log in button

  @ScenarioLogInSuccessful
  Scenario Outline: Successful Log in
    And the user fills the fields with his log in information
      | email   | password   |
      | <email> | <password> |

    Then The user must see that the email entered is the same as indicated on the screen

    Examples:
      | email                | password         |
      | marios@notengo.com   | Abcdefg123456789 |
      | luise0003@outlook.es | Luis102627       |

  @ScenarioIncorrectEmailOrAndPassword
  Scenario Outline: Incorrect email or and password
    And the user fills the fields with invalid information
      | email   | password   |
      | <email> | <password> |

    Then the user should see the follow message Invalid username or password.

    Examples:
      | email                | password         |
      | marios@notengo.co    | Abcdefg123456789 |
      | luise0003@outlook.es | Luis102          |


  @ScenarioSignInButtonInactive
  Scenario: The sign in button must be inactive until the information is filled out
    Then the user should see the sign in button inactive


  @ScenarioForgetPasswordButton
  Scenario: The forgot password button must exist
    Then the user would see the forgot password button exist