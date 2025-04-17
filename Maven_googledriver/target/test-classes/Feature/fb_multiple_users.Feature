Feature:
fb multiple user login
Scenario Outline:
Given open Chrome Browser
Then enter Invalid "<username>" UserName
Then enter Invalid "<password>" Password
Then click Login
And close Browser

Examples:
|username            |password  |
|java@gmail.com      |java123   |
|python@gmail.com    |python123 |
|selenium@gmail.com  |selenium123|