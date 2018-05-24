Feature: I want to book a holiday
  As a user
  I want to be able to search holiday parameters
  So that I can book a holiday

  Scenario: Booking a hotel
    Given I Go to the correct web page
    When I Enter holiday details
    And I click the search button
    Then I am taken to the results page
    When I click on the first result
    Then It will take me to the hotel page
    When I click on the book now button
    Then I am taken to the confirmation page
