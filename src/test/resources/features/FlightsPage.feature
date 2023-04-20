Feature: Flights booking

  Scenario: Round trip flight booking
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on flights link
    And user selects trip type as round trip
    And user select "3" passengers
    And user selects departing from as "London"
    And user selects departing on month "November" and day "15"
    And user selects arriving in as "Paris"
    And user selects returning on month "December" and day "25"
    And user selects service class as business class
    And user selects airline "Unified Airlines"
    And user clicks on continue button
    Then flights results page is displayed
