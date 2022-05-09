Feature: User Registeration
check that the user can register successfully

Scenario: User Registeration
Given the user in the home page
When  I press on SignUp button 
And   I enter the emial to register
And   I enter all the info
Then  I register successfully
