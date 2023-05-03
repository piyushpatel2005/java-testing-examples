Feature: Application Login

  Background:
    Given validate the browser
      When Browser is opened
      Then Check if browser is started.

  @RegTest
  Scenario: Home page default login
    Given User is on Netbanking landing page
      When User login into application with username "one" and password "one"
      Then Home page is populated
        And Cards displayed "true"

  @SmokeTest
  Scenario: Home page invalid login
    Given User is on Netbanking landing page
      When User login into application with username "two" and password "two"
      Then Home page is populated
        And Cards displayed "false"

  @RegTest
  Scenario: Sign up Success
    Given User is on Netbanking landing page
      When User sign up with following details
        | jenny | password | jenny@example.com | India | (999)923-987 |
      Then Home page is populated
        And Cards displayed "false"

  @SanityTest
  Scenario Outline: Home page valid login with sample users.
    Given User is on Netbanking landing page
      When User login into application with sample users as : username <Username> and password <Password>
      Then Home page is populated
        And Cards displayed "true"

    Examples:
      | Username | Password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |