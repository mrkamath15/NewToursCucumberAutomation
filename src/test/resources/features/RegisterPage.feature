Feature: Registration

  Scenario: Register with blank values
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    And user clicks on register link
    When user clicks on submit registration
    Then registration success page is displayed

  Scenario: Register with valid values
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    And user clicks on register link
    When user enters first name "Mark"
    And user enters last name "Zukerberg"
    And user enters phone number "8989898998"
    And user enters email address "mark.zukerb@gmail.com"
    And user enters address "75, layman street, toronto, CA"
    And user enters city "Toronto"
    And user enters state "Ontario"
    And user enters postal code "676767"
    And user selects country "INDIA"
    And user enters registration username "markzuk"
    And user enters registration password "admin"
    And user enters registration confirm password "admin"
    And user clicks on submit registration
    Then registration success page is displayed