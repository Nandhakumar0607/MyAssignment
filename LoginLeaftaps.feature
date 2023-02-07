Feature: Login to LeafTaps Application

Scenario Outline: Login with valid Credentials
Given Open Chrome browser
And launch the application
And user enter username as <Username>
And user enter password as <Password>
When user click login button
Then user should redireced to Homepage

Examples:
|Username|Password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

#Scenario: Login with Invalid Credentials
#Given Open Chrome browser
#And launch the application
#And user enter username as 'Democsr'
#And user enter password as 'crmsfa123	'
#When user click login button
#But Error message wil be displayed