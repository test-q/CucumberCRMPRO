Feature: Test Login Feature 
#   Hooks used - check step defination file
#	Without Parameterizing - This is hard coded username and password
Scenario: Verify Login with valid Credentials 
	Given user is on login page 
	When user enter valid username and password
	And click on login button 
	Then user navigate to home page 
	

#	Parameterizing without Example Keyword
@second
Scenario: Verify Login with invalid username and valid password 
	Given user is on login page 
	When user enter invalid "batchautomation12" and valid "Test@12345" 
	And click on login button 
	Then user not navigate to home page 
	
#  Parameterizing with Example Keyword
@third
Scenario Outline: Verify Login with valid username and invalid password 
    Given user is on login page 
	When user enter valid <username> and invalid <password>
	And click on login button 
	Then user not navigate to home page 
	
Examples:
		| username | password |
		| rup123   | test123  |
		| sha123   | 123test  |
		| batchautomation | Test@12345 |
		
		

	
