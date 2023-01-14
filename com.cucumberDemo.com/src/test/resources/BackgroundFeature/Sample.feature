Feature: Feature to test the functionality of search and result selection for valid Data

Background: 
Given User opens the browser
Then User enters the "https://www.smartbazaar.co.uk/my-account/"

Scenario: User checks the search functionality
And User enters the search Data
When User clicks on the search icon
Then User verifies the search result
And User close the browser

Scenario Outline: User checks the search selection functionality
And User enters the '<search>' Data
When User clicks on the search icon
And User selects the '<searchresult>' from the list
Then User verifies the '<searchresult>' result
And User close the browser

Examples:
|search|searchresult|
|rice  | ASALI NAVARA RICE (1KG) |
|flower| CAULIFLOWER (EACH) |