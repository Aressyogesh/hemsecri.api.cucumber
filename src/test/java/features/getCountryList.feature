Feature: Country List
@Regression
Scenario: Get Country List
	Given Country List
	When user calls "getCountryListAPI" with "GET" http request 	
	Then the API call got success with status code 200
	
	
