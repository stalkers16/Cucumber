$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Sample1.feature");
formatter.feature({
  "line": 1,
  "name": "Introduction to cucumber part 1",
  "description": "As a test engineer\r\nI want to be able to write and execute a simple scenario",
  "id": "introduction-to-cucumber-part-1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6616443400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Simple scenario",
  "description": "",
  "id": "introduction-to-cucumber-part-1;simple-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see home page header",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should see home page description",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see menu",
  "keyword": "And "
});
formatter.match({
  "location": "SampleSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 749000800,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iShouldSeeHomePageHeader()"
});
formatter.result({
  "duration": 42483100,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iShouldSeeHomePageDescription()"
});
formatter.result({
  "duration": 31040400,
  "status": "passed"
});
formatter.match({
  "location": "SampleSteps.iShouldSeeMenu()"
});
formatter.result({
  "duration": 24445100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"class name\",\"selector\":\"w3-navbar\"}\n  (Session info: chrome\u003d89.0.4389.90)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.19041 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027GATY-MAIN\u0027, ip: \u002777.38.206.90\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\zagar\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 89.0.4389.90, webStorageEnabled: true}\nSession ID: 029326e3c9f6ba111cda811b41fec3ed\n*** Element info: {Using\u003dclass name, value\u003dw3-navbar}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:403)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat stepDefinitions.SampleSteps.iShouldSeeMenu(SampleSteps.java:101)\r\n\tat ✽.And I should see menu(src/test/resources/features/Sample1.feature:9)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://kristinek.github.io/site/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1494669100,
  "status": "passed"
});
});