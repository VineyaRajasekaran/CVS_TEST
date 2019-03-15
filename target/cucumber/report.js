$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shopOnlineCVS.feature");
formatter.feature({
  "line": 1,
  "name": "Check Shop Online;",
  "description": "",
  "id": "check-shop-online;",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "Sign In Functionality \u003c!-- --\u003e",
  "description": "",
  "id": "check-shop-online;;sign-in-functionality-\u003c!-----\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "the user is in homepage and clicks on Sign in",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "the user provides \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "validate the user and password",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "check-shop-online;;sign-in-functionality-\u003c!-----\u003e;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 32,
      "id": "check-shop-online;;sign-in-functionality-\u003c!-----\u003e;;1"
    },
    {
      "cells": [
        "vineya@gmail.com",
        "Reheboth2019!"
      ],
      "line": 33,
      "id": "check-shop-online;;sign-in-functionality-\u003c!-----\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "browser details of CVC",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "browser trigerred to CVC website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "check whether CVC browser is opened.",
  "keyword": "Then "
});
formatter.match({
  "location": "OnlineShopCVS.browser_details_of_cvc()"
});
formatter.result({
  "duration": 3374480212,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShopCVS.browser_trigerred_to_cvc_website()"
});
formatter.result({
  "duration": 3415784544,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShopCVS.check_whether_cvc_browser_is_opened()"
});
formatter.result({
  "duration": 23691314,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Sign In Functionality \u003c!-- --\u003e",
  "description": "",
  "id": "check-shop-online;;sign-in-functionality-\u003c!-----\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "the user is in homepage and clicks on Sign in",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "the user provides vineya@gmail.com and Reheboth2019!",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "validate the user and password",
  "keyword": "Then "
});
formatter.match({
  "location": "OnlineShopCVS.the_user_is_in_homepage_and_clicks_on_Sign_in()"
});
formatter.result({
  "duration": 11503002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vineya@gmail.com",
      "offset": 18
    },
    {
      "val": "Reheboth2019!",
      "offset": 39
    }
  ],
  "location": "OnlineShopCVS.the_user_provides_and(String,String)"
});
formatter.result({
  "duration": 12193584976,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"email\"}\n  (Session info: chrome\u003d72.0.3626.121)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027DESKTOP-E1K2OQS\u0027, ip: \u0027192.168.0.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\dinav\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 72.0.3626.121, webStorageEnabled: true}\nSession ID: 3d3cca5653cf950105acc0894d2f5e16\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat stepDefinitionCVS.OnlineShopCVS.the_user_provides_and(OnlineShopCVS.java:190)\r\n\tat ✽.When the user provides vineya@gmail.com and Reheboth2019!(shopOnlineCVS.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OnlineShopCVS.validate_the_user_and_password()"
});
formatter.result({
  "status": "skipped"
});
});