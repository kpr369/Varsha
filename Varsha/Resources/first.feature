Feature: RediffMail Login

  Scenario Outline: Login with invalid credentials
    Given I open browser and navigate to rediff mail
    And i enter invalid <user name> and <passowrd>
    When i clik on Login Button
    Then Login get fail and error message should display

    Examples: 
      |user name	|password|
      | kpr369    | Nanda@369 |
      | kpr369    | Nanda@369 |		