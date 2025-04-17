$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/cjaya/eclipse-workspace1/Cucumber_fb/src/test/resources/Feature_file/FB_Login.Feature");
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
  "name": "open edge driver",
  "keyword": "Given "
});
formatter.match({
  "location": "Fb_login.open_edge_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter user email",
  "keyword": "When "
});
formatter.match({
  "location": "Fb_login.enter_user_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password",
  "keyword": "And "
});
formatter.match({
  "location": "Fb_login.enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Login",
  "keyword": "And "
});
formatter.match({
  "location": "Fb_login.click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_login.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});