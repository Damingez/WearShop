Feature: Application login

  @LoginTest
  Scenario: Home page default login
    Given the user is on WearShop login page
    When the user logins into application with "kowalix93@gmail.com" and password "testy12345"
    Then My account page is displayed
    And the user Fullname "Damian Kowaski" is displayed in the upper panel