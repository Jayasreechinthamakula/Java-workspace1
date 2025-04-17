$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/cjaya/eclipse-workspace1/Maven_googledriver/src/test/resources/Feature/fb_multiple_users.Feature");
formatter.feature({
  "name": "",
  "description": "fb multiple user login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "name": "enter Invalid \"\u003cusername\u003e\" UserName",
  "keyword": "Then "
});
formatter.step({
  "name": "enter Invalid \"\u003cpassword\u003e\" Password",
  "keyword": "Then "
});
formatter.step({
  "name": "click Login",
  "keyword": "Then "
});
formatter.step({
  "name": "close Browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "java123"
      ]
    },
    {
      "cells": [
        "python@gmail.com",
        "python123"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "selenium123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fb_Multiple_users.open_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Invalid \"java@gmail.com\" UserName",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.enter_Invalid_UserName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Invalid \"java123\" Password",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.enter_Invalid_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Multiple_users.close_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fb_Multiple_users.open_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Invalid \"python@gmail.com\" UserName",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.enter_Invalid_UserName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Invalid \"python123\" Password",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.enter_Invalid_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Multiple_users.close_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fb_Multiple_users.open_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Invalid \"selenium@gmail.com\" UserName",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.enter_Invalid_UserName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Invalid \"selenium123\" Password",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.enter_Invalid_Password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Multiple_users.click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Multiple_users.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});