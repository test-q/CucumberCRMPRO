Feature: Test Create Deal Feature With Map

# Data Table with header --Map method
Scenario: Verify create deal test. 
	Given brower is open 
	And user is on login page 
	When user enter valid username and password 
		| username		  | password   |
		| batchautomation | Test@12345 |		
	And click on login button 
	When user navigate to new deal page 
	And user enters deal details 
		| title	  | amount | probability | commission |
		| deal10  | 1000   | 50          | 10         |
		| deal20  | 2000   | 40          | 5          |
		| deal30  | 3000   | 30          | 1          |
	Then close browser