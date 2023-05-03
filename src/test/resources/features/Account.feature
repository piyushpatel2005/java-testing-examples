Feature: Application Account

  @RegTest
  Scenario: Home page default login
    Given User is on Netbanking landing page
    When User login into application with username "one" and password "one"
    Then Home page is populated
    And Cards displayed "true"
