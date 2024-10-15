Feature: Login in home Page

  Scenario: Login
    Given User is already on login page
    When title of login page
    Then user enter username and password
    And User click on login

    Scenario Outline: Home Page

      Given  enter <username> and <password>
      When  sxsx
      Then scsc

      Examples:
      | username  | password  |
      | username1 | password1 |
      | username2 | password2 |