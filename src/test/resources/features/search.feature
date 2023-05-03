Feature: Search and Place orders

  @BrowserTest
  Scenario: Search for items and validate results
    Given User is on the landing page of GreenKart.
    When User searched for "cucumber" vegetable
    Then "cucumber" results are displayed.

    @BrowserTest
  Scenario: Search for items and then move to checkout page
    Given: User is on Greenkart landing page.
    When User searched for "Brinjal" vegetable
    And Added items to cart
    And User proceeded to checkout page for purchase
    Then verify selected "Brinjal" items are displayed in Checkout page.