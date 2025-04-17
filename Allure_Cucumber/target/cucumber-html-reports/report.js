$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/cjaya/eclipse-workspace1/Allure_Cucumber/src/test/resources/Feature_file1/Fb_login.Feature");
formatter.feature({
  "name": "",
  "description": "To validate login functionality of Fb",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "TO open Fb login with incorrect username and Password",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open edge browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.open_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter  invalid user email",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.enter_invalid_user_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter  invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.enter_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.close_Browser()"
});
formatter.result({
  "error_message": "java.lang.StackOverflowError\r\n\tat org.stepdefinition.LoginPage.close_Browser(LoginPage.java:43)\r\n\tat ✽.close Browser(C:/Users/cjaya/eclipse-workspace1/Allure_Cucumber/src/test/resources/Feature_file1/Fb_login.Feature:11)\r\n",
  "status": "failed"
});
});