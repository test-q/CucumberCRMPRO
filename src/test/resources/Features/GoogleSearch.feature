Feature:  Feature to check google search funcationality.

Scenario: Validate google search is working.
	Given browser is open
	And user is on google search page
	When enter text in search box
	And click on serch button
	Then user navaigate to secrh page