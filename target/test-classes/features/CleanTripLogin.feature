Feature: ClearTrip Login

  Scenario: User tries to log in to ClearTrip website
    Given User launches Chrome browser
    When User opens URL "https://www.cleartrip.com/"
    And User closes the login popup
    Then User clicks on the Offer option
    And User is navigated to the home page and tile should be "Cleartrip: #1 Site for Booking Flights Tickets & Hotels Online - Get Best Travel Deals"

   