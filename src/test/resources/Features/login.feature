Feature: Test Login Feature 

 Without Parameterizing - This is hard coded username and password
Scenario: Verify Login with valid Credentials 
	Given browser is open 
	And user is on login page 
	When user enter valid username and password
	And click on login button 
	Then user navigate to home page 
	

#	Parameterizing without Example Keyword
Scenario: Verify Login with invalid username and valid password 
	Given browser is open 
	And user is on login page 
	When user enter invalid "batchautomation12" and valid "Test@12345" 
	And click on login button 
	Then user not navigate to home page 
	
#  Parameterizing with Example Keyword
Scenario Outline: Verify Login with valid username and invalid password 
	Given browser is open 
	And user is on login page 
	When user enter valid <username> and invalid <password>
	And click on login button 
	Then user not navigate to home page 
	
Examples:
		| username | password |
		| rup123   | test123  |
		| sha123   | 123test  |
		| batchautomation | Test@12345 |
		
		

	
