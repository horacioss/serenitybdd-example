Feature: Buy a product

  Scenario: Buy an iPhone 7
    Given user is in the homepage
    When place an order for an iPhone 7
    Then he should can see the success message 'bien hecho!'