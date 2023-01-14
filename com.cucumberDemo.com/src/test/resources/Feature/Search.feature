Feature: Feature to test the functionality of search for valid Data
@SmokeTest
Scenario: User checks the search functionality
Given User opens the browser
Then User enters the "https://www.smartbazaar.co.uk"
And User enters the search Data
When User clicks on the search icon
Then User verifies the search result
And User close the browser

