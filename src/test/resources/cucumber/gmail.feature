Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: Check warning message because of improper extension
    Given User navigate to login page and with login and password "automationEpamUser2@gmail.com","user212345678"
    When User navigate to settings page
    When User navigate to theme page
    When User select photo "photo.txt" from computer
    Then User see warning message

  Scenario: Check that message transporting in the spam folder
    Given User navigate to login page and with login and password "automationEpamUser1@gmail.com","user112345678"
    When User send message "hellodjkfhjkfh" to another user with email "automationEpamUser2@gmail.com"
    When User navigate to default window
    When User log out
    When User switch to another profile
    When User authorizate with following login and password "automationEpamUser2@gmail.com","user212345678"
    When User marks received message as spam
    When User log out
    When User switch to another one
    When User authorizate with following login and password "automationEpamUser1@gmail.com","user112345678"
    When User send message "second msg" to another user with email "automationEpamUser2@gmail.com"
    When User navigate to default window
    When User log out
    When User switch to another one
    When User authorizate with following login and password "automationEpamUser2@gmail.com","user212345678"
    When User navigates to spam page
    Then Check that message from "Anatoly Anatolyev" is in spam folder
 
  Scenario: Check possibility of attaching big file to message
    Given User navigate to login page and with login and password "automationEpamUser2@gmail.com","user212345678"
    When User send message with attachment over than 25 MB to another user with email "automationEpamUser1@gmail.com","file.txt"
    Then User see warning message that size of file over than 25 MB 
	

    
    
