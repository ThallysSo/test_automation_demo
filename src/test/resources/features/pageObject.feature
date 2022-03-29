Feature: Purchase

  Scenario: Purchase Business Flow.
    Given that I'm on the login page and enter the username "standard_user"
    And fill the password field with "secret_sauce"
    And Click in Login button
    When Add product to the Cart
    And Go to shopping Cart
    And Proceed with checkout
    And fill first name "Thallys"
    And fill last name "Souza"
    And fill postal Code "99999-999"
    And click to continue checkout
    And check if the "Sauce Labs Backpack" product is in the checkout overview
    And click to finish purchase
    Then Receive the confirmation message that the purchase was complete "THANK YOU FOR YOUR ORDER"