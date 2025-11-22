@searchFlights
Feature: ClearTrip Login

  Scenario: User tries to log in to ClearTrip website
    Given User launches Chrome browser
    When User opens URL "https://www.cleartrip.com/"
    And  User closes the login popup
    When User clicks on from input box Drop Down will Displayed
	Then User Selects  source City from the Drop Down
	When User clicks on ToCity input box Drop Down will Displayed
	Then User Selects  Destination City from the Drop Down
	And  User clicks on search flights Button 
	