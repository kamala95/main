Feature: Dashboard functionalities

  Background:
    Given the user has successfully logged in with valid credentials

  Scenario Outline: Exploring the Dashboard Options
    When the user navigates to the dashboard page
    Then the bank's logo should be displayed in the top left corner of the page
    And there should be a "<link>" option
    Examples:
      |link                |
      |Mortgage Application|
      |Application List    |

  Scenario Outline:Clicking on Links and Redirecting to Pages
    When the user click "<link>"
    Then the user's current page should be the "<url>" page
    Examples:
      |link                 |url                                                                |
      |Mortgage Application | http://qa-duobank.us-east-2.elasticbeanstalk.com/mortgage.php     |
      |Application List     | http://qa-duobank.us-east-2.elasticbeanstalk.com/applications.php |


  Scenario: Logging Out from the System
    Then the user's account information should be visible in the top right corner
    When the user clicks on their name or picture
    Then a dropdown menu should appear with a Logout link
    When the user clicks on the Logout link
    Then the user should be successfully logged out of the system


