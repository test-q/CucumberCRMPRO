Feature: Test Login Feature 


Scenario: check login with valid data 
	Given user is on login page 
	When user enter valid username and password 
	And Click on login button 
	Then User navigate to home page 
