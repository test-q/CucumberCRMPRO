Feature: Test Create Deal Feature

# Data Table without header -- asLists()
Scenario: Verify create deal test.
	Given brower is open
	And user is on login page
	When user enter valid username and password
		| batchautomation | Test@12345 |		
	And click on login button
	When user navigate to new deal page
	And user enters deal details
		| BY1GET3  | 1000 | 50 | 10 |
	Then close browser