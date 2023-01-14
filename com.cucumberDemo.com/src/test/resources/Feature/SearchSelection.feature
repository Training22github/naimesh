Feature: Feature to test the functionality of search selection for valid Data

Scenario Outline: User checks the search selection functionality
Given User opens the browser
Then User enters the "https://www.smartbazaar.co.uk/my-account/"
And User enters the '<search>' Data
When User clicks on the search icon
And User selects the '<searchresult>' from the list
Then User verifies the '<searchresult>' result
And User close the browser

Examples:
|search|searchresult|
|rice  | ASALI NAVARA RICE (1KG) |
|flower| CAULIFLOWER (EACH) |