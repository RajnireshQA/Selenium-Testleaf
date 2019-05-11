Feature: Login for Leaftaps Application

Background:
Given Open the Chrome Browser
And Maximize the Browser 
And Set the Timeout
And Load the URL

Scenario Outline: TC001 Positive Login Flow
And Enter the Username as <username>
And Enter the Password as <password>
When Click on Login Button
Then User Should Navigate to HomePage

Examples:
|username|password|
|Demosalesmanager|crmsfa|
|Democsr|crmsfa|



Scenario: TC001 Positive Login Flow
And Enter the Username as Democsr
And Enter the Password as crmsfa1
When Click on Login Button
But User Should Navigate to LoginPage