Feature: To validate login functionality
@withoutParameter @Regression
Scenario: Valid Login Scenario
	Given Login payload
	When user calls "checkLoginAPI" with "Post" http request 	
	Then the API call got success with status code 200
	#And verify response time less than 5 seconds 
	And "status" in response body is "true"
	And "ecrI_Login" in response body is "eq2test"
	
@withParameter #@Regression
Scenario Outline: Valid Login Data Driven Scenario
	Given Login payload with "<userName>" "<password>"
	When user calls "checkLoginAPI" with "Post" http request
	Then the API call got success with status code 200
	#And verify response time less than 5 seconds
	And "status" in response body is "true"
	And "ecrI_Login" in response body is "eq2test"

Examples:
|userName|password|
|admin	 |super   |
|admin	 |super   |