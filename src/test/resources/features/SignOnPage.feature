Feature: Login functionality in home page

  Scenario: Blank username and password
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username ""
    And user enters password ""
    And user clicks on submit button
    Then user is logged in successfully

  Scenario: Blank username
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username ""
    And user enters password "yuyuyu"
    And user clicks on submit button
    Then validation message "Enter your userName and password correct" is returned

  Scenario: Blank password
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username "trtrt"
    And user enters password ""
    And user clicks on submit button
    Then validation message "Enter your userName and password correct" is returned

  Scenario: Invalid username and password
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username "trtrt"
    And user enters password "erer"
    And user clicks on submit button
    Then validation message "Enter your userName and password correct" is returned

    @Sanity
  Scenario: Valid username and password
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username "qwe"
    And user enters password "qwe"
    And user clicks on submit button
    Then user is logged in successfully