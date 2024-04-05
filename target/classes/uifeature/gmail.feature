Feature: Gmail Compose Functionality
Scenario: compose functionality
Given user is at gmail page
When user click on sign in button
Then user navigated to sign page
When user enter email as <"test@gmail.com">
And user click on next button
And user enter password as <"test@123">
And user click on  next button 
Then user navigate to gmail inbox
When user click on compose button 
Then new message window got open 
When user enter the email address in To field 
And user enter the subject in subject field 
And user enter the message in the message area
And user click on send button 
