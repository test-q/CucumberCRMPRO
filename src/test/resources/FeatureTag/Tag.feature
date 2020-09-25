@all 
Feature: Feature to demo tags. 

@smoke 
Scenario: Sample Smoke 1 
	Given  app open 
	When  Enter Tag 
	Then  check for tag 
	
	
@regression 
Scenario: Sample Regression 1 
	Given  app open 
	When  Enter Tag 
	Then  check for tag 
	
	
@end2end 
Scenario: Sample END2END 1 
	Given  app open 
	When  Enter Tag 
	Then  check for tag 
	
@end2end 
Scenario: Sample END2END 2 
	Given  app open 
	When  Enter Tag 
	Then  check for tag 
	
@smoke @regression 
Scenario: Sample 1 
	Given  app open 
	When  Enter Tag 
	Then  check for tag 
	
@smoke @regression 
Scenario: Sample 2 
	Given  app open 
	When  Enter Tag 
	Then  check for tag 
	
@smoke @regression 
Scenario: Sample 3 
	Given  app open 
	When  Enter Tag 
	Then  check for tag 

@inherit
Scenario Outline: Sample ScenarioOutline 1 
	Given  app open 
	When  Enter enter data <username> and <password>
	Then  check for tag 	
	
Examples: 
		| username        | password   |
		| riya            | Test@12345 |
		| priya           | 123test    |
		| Diya            | di123      |
		
