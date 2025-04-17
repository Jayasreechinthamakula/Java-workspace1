Feature:
To validate login functionality of Fb

Scenario:

TO open Fb login with incorrect username and Password
Given  open edge driver
When  enter user email
And enter password
And click Login
Then close Browser
