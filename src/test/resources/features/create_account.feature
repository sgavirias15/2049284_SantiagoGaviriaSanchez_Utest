#author: Santiago Gaviria Sánchez

Feature: As a user, i need to perform the validations that ensure the creation of a successful account on the Utest.com page

  Background:
    Given that the user is on the main page
    When the user selects the join today button

  @ScenarioAccountSuccessful
  Scenario Outline: Successful account creation
    And the user fills in his personal information
      | firstName   | lastName   | email   | month   | day   | year   | city   | zip   | password   | confirmPassword   |
      | <firstName> | <lastName> | <email> | <month> | <day> | <year> | <city> | <zip> | <password> | <confirmPassword> |

    Then the user should see the word Welcome

    Examples:
      | firstName | lastName | email              | month  | day | year | city     | zip     | password        | confirmPassword |
      | Pedro     | Arbelaez | ae34488so@xxdf.com | August | 18  | 1993 | Medellín | 0500500 | Abcdef123456789 | Abcdef123456789 |

  @ScenarioEmailIncorrect
  Scenario: Enter invalid email when creating a new account
    And the user enters the email with a incorrect format
      | firstName | lastName       | email              |
      | Alberto   | Garcia Gaviria | albert1025@notengo |
    Then the user would see the following sentence Enter valid email

  @ScenarioIncompleteFields
  Scenario: Incomplete fields
    And the user leaves empty fields in the form
      | lastName        | email              |
      | Gaviria Sanchez | albert1345@notengo |
    Then the user will not be able to continue to the next step

  @ScenarioEnabledNextStepButton
  Scenario: Enabled next step button
    And the user leaves empty some fields in the form
      | lastName        | email              |
      | Gaviria Sanchez | albert1345@notengo |
    Then the user should see next step button disabled

  @ScenarioMovingToTheSecondForm
  Scenario: Moving to the second form
    And the user fills in all his personal information
      | firstName | lastName | email               | month  | day | year |
      | Santiago  | Arbelaez | ae3sda3rso@fsdf.com | August | 18  | 1993 |
    Then the user would see the second form named Add your address

  @ScenarioMovingToTheLastStep
  Scenario: Checking the back button
    And the user fills in his information
      | firstName | lastName | email               | month  | day | year |
      | Santiago  | Arbelaez | ae3sda3rso@fsdf.com | August | 18  | 1993 |
    And the user clicks on the back button
    Then the user should see the first form named Tell us about yourself

  @ScenarioCheckDescriptionStep3
  Scenario: Check the description of step three
    And the user fills in all the personal information of the steps one and two
      | firstName | lastName      | email             | month     | day | year | city     | zip     |
      | Daniel    | Jimenez Perea | darromelan@df.com | September | 15  | 1993 | Medellín | 0500500 |
    Then the user would see the following description

  @ScenarioCheckThatPasswordsMatchStep4
  Scenario: Check that passwords match in step four
    And the user fills in all the personal information of the steps one two and three
      | firstName | lastName | email         | month | day | year | city     | zip     | password        | confirmPassword  |
      | Carlos    | Gaviria  | carlos@xf.com | June  | 15  | 1990 | Medellín | 0500500 | Abcdefg12345678 | Abcdefg123456789 |
    Then the user should see that the passwords match

  @ScenarioUnselectedChecksStep4
  Scenario: Verify that it does not allow to continue if the checks of terms of use and security have not been selected
    And the user fills in all the personal information up to step four
      | firstName | lastName | email         | month | day | year | city     | zip     | password         | confirmPassword  |
      | Katerine  | Gaviria  | carlos@xf.com | June  | 15  | 1990 | Medellín | 0500500 | Abcdefg123456789 | Abcdefg123456789 |
    Then the user should see that it is not possible to continue if he does not select the checks