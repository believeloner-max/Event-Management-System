Feature: Admin Login for EMS Application
Scenario: Admin Login with valid credentials

//Given click on the adminLoginLink
When Enter the AdminEmail Address as 'admin@ems.com'
And Enter the AdminPassword as 'Admin@123'
And click on Adminlogin button
Then The admin should be logged in successfully