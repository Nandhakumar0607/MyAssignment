Feature: Create a Lead in Leaftaps Application
Background:
Given Open Chrome browser
And launch the application
And user enter username as 'Demosalesmanager'
And user enter password as 'crmsfa'
When user click login button
Then user should redireced to Homepage
When user clicks on 'CRM/SFA'
Then 'My Home' page should displayed
	
	 
	
Scenario Outline: Create a Lead in Leaftaps
	
When user clicks on 'Leads'
Then 'My Leads' page should displayed
When user clicks on 'Create Lead'
Then 'Create Lead' page should displayed
When user enter Firstname as <Firstname>
And user enter Lastname as <Lastname>
And user enter Company as <Company>
When user click 'Create Lead' button
Then 'View Lead' page should displayed
Then Close the Application
	
Examples:
|Firstname|Lastname|Company|
|'Nandha'|'Kumar'|'Accenture'|
|'Naveen'|'Kumar'|'HCL'|		


Scenario Outline: Edit a Lead in Leaftaps

When user clicks on 'Leads'
Then 'My Leads' page should displayed
When user clicks on 'Find Leads'
Then 'Find Leads' page should displayed
When user select phone Option
Then user enter phone as <Phone>
When user click on Find Leads button
And user click on First result
And user clicks on 'Edit'
And user update Company as <Company>
And user click 'Update' button
Then Leads got Updated
Then Close the Application

Examples:
|Phone|Company|
|'9940332576'|'Accenture'|
|'7008405629'|'HCL'|	


Scenario Outline: Edit a Lead in Leaftaps

When user clicks on 'Leads'
Then 'My Leads' page should displayed
When user clicks on 'Find Leads'
Then 'Find Leads' page should displayed
When user select phone Option
Then user enter phone as <Phone>
When user click on Find Leads button
And user click on First result
And user clicks on 'Delete'
Then Leads got Deleted
Then Close the Application


Examples:
|Phone|
|'9940332576'|
|'145'|	













