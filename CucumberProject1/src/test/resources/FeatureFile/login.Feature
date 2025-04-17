Feature:
 To Validata Login Functionality of Facebook Application
 
Scenario:

  To Validate fb login with invalid username and invalid password


  Given to launch chrome browser and hit the url
  
  When  To Enter Valid username in  email field
 
  And  To enter invalid Password in password field
 
  And  To Click The Login buttin
  Then To Close the  Chrome browser
  
 Scenario Outline:
To validate fblogin with invalid username and password 

Given to launch chrome browser and hit the url
And  To Enter invalid username "<username>"in email field
And  To Enter invalid password "<password>"in password field
And  To click login 
Then  To close chrome browser

Examples:
|username|Password|
|java@gmail.com|java123|
|python@gmail.com|python123|
|cucumber@gmail.com|cucumber123|

