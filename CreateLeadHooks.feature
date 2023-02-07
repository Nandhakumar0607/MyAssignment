Feature: Create a Lead in Leaftaps Application
	
Scenario Outline: Create a Lead in Leaftaps

Given user should redireced to Homepage
When user clicks on 'CRM/SFA'
Then 'My Home' page should displayed	
When user clicks on 'Leads'
Then 'My Leads' page should displayed
When user clicks on 'Create Lead'
Then 'Create Lead' page should displayed
When user enter Firstname as <Firstname>
And user enter Lastname as <Lastname>
And user enter Company as <Company>
When user click 'Create Lead' button
Then 'View Lead' page should displayed

	
Examples:
|Firstname|Lastname|Company|
|'Nandha'|'Kumar'|'Accenture'|
|'Naveen'|'Kumar'|'HCL'|		


	













