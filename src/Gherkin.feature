Feature: User Email log in

  As a user I require to log in to my email

  Acceptance Criteria:
  - Check if it logs in with the valid user name and password as per the requirement.
  - Check if User log in with valid username and invalid password.
  - Check if user log in with invalid username and valid password.
  - Check if the both Username and password field is left blank
  - Check if the Username has valid credentials and password field is left blank
  - Check if the Username is left blank and password field has valid credentials
  - Check when the Username email is in incorrect format but password field has valid credentials
  - Check when the Username has valid credentials but password field does not match minimum 6 character requirement

  Scenario: Check if it logs in with the valid user name and password as per the requirement
    Given I am log in page
    When I enter my username as "sr_1989@bmail.com"
    And I enter my password "Risal#89"
    And I clicked on the login button
    Then I should be able to log in
    And I should be able to see my email page.

  Scenario: Check if User log in with valid username and invalid password
    Given I am log in page
    When I enter my username as "sr_1989@bmail.com"
    And I enter my password "Risal89"
    And I clicked on the login button
    Then I should not be able to log in
    And I should see "Please enter valid credentials" message.

  Scenario: Check if user log in with invalid username and valid password
    Given I am log in page
    When I enter my username as "sr_1989bmail.com"
    And I enter my password "Risal89"
    And I clicked on the login button
    Then I should not be able to log in
    And I should see "Please enter valid credentials" message.

  Scenario: Check if the both Username and password field is left blank
    Given I am log in page
    When I leave the username as blank
    And I leave my password as blank
    And I clicked on the login button
    Then I should not be able to log in
    And I should see "Please enter Username and Password" message.

  Scenario: Check if the Username has valid credentials and password field is left blank
    Given I am log in page
    When I enter my username as "sr_1989@bmail.com"
    And I leave my password as blank
    And I clicked on the login button
    Then I should not be able to log in
    And I should see "Please enter Password" message.

  Scenario: Check if the Username is left blank and password field has valid credentials
    Given I am log in page
    When I left my username as blank
    And I entered my password as "Risal89"
    And I clicked on the login button
    Then I should not be able to log in
    And I should see "Please enter Username" message.

  Scenario: Check when the Username email is in incorrect format but password field has valid credentials
    Given I am log in page
    When I entered my username as "sr1989@bmail.com"
    And I entered my password as "Risal89"
    And I clicked on the login button
    Then I should not be able to log in
    And I should see "The username provided is not valid" message.

  Scenario: Check when the Username has valid credentials but password field does not match at least one Uppercase requirement
    Given I am log in page
    When I entered my username as "sr_1989@bmail.com"
    And I entered my password as "risal89"
    And I clicked on the login button
    Then I should not be able to log in
    And I should see "The password provided is not valid" message.