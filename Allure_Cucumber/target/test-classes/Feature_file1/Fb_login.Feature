Feature:
To validate login functionality of Fb

Scenario:

TO open Fb login with incorrect username and Password
Given  open edge browser
When  enter  invalid user email 
And enter  invalid password
And click Login 
Then close Browser

