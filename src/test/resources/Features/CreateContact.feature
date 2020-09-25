Feature: Test Create Contact Feature

#	Parameterizing without Example Keyword
Scenario Outline: Verify create contact test.
	Given browser is open 
	And user is on login page
	When user enter valid <username> and <password>
	And click on login button
	When user navigate to new contact page
	And user enters <firstname> and <lastname>  and <position>
	Then close browser

	
Examples:
	| username        | password   | firstname | lastname | position |
	| batchautomation | Test@12345 | Seema     | Dave     | Manager  |
	| batchautomation | Test@12345 | Purvi     | Rathod   | QA       |
	
	