Feature: Register of user
  As a user I want to register on the demo page
  to have a valid account

  @Successful
  Scenario: successful user registration
    Given that the user opens the demo page and opens the registration option
    When the user enters the registration data appropriately
    Then You will be able to see a successful registration message