Feature: Create account for EMS Application
Scenario: Create account with valid credentials

When Enter the FirstName as 'John'
And Enter the EmailAdress as 'nvlatha04@gmail.com'
And Enter the PassWord as 'Latha@123'
And click on Register button
Then The user should be registered successfully