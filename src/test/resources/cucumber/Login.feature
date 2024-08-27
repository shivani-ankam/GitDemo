Feature: Login
  In order to login to Testmeapp, user should be a registered user



Scenario: The one where user login successfully
    Given testuser01 is registered user on TestMeApp
    When testuser01 enter correct credentials
    And logins
    Then TestMeApp renders to testuser01 home page
