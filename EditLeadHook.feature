Feature: Create a Lead in Leaftaps Application

Scenario Outline: Edit a Lead in Leaftaps

Given user should redireced to Homepage
When user clicks on 'CRM/SFA'
Then 'My Home' page should displayed
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


Examples:
|Phone|Company|
|'9940332576'|'Accenture'|
|'99'|'HCL'|	