$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CoursePlay.feature");
formatter.feature({
  "line": 2,
  "name": "End to End scenario For CoursePlay Application",
  "description": "",
  "id": "end-to-end-scenario-for-courseplay-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CoursePlay"
    }
  ]
});
formatter.before({
  "duration": 75000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User verify the Login Name",
  "description": "",
  "id": "end-to-end-scenario-for-courseplay-application;user-verify-the-login-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Url"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Courseplaysteps.user_launch_the_application()"
});
formatter.result({
  "duration": 136507784100,
  "status": "passed"
});
formatter.after({
  "duration": 1730600,
  "status": "passed"
});
formatter.before({
  "duration": 20900,
  "status": "passed"
});
formatter.scenario({
  "line": 1848,
  "name": "user logout the application",
  "description": "",
  "id": "end-to-end-scenario-for-courseplay-application;user-logout-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 1847,
      "name": "@TC-002_Signout"
    }
  ]
});
formatter.step({
  "line": 1849,
  "name": "User click on the profile",
  "keyword": "Given "
});
formatter.step({
  "line": 1850,
  "name": "User Click on Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "Courseplaysteps.user_click_on_the_profile()"
});
formatter.result({
  "duration": 30134472500,
  "error_message": "java.lang.RuntimeException\r\n\tat org.Courseplay.baseclass.BaseClass.elementClick(BaseClass.java:227)\r\n\tat org.Courseplay.StepDefinition.Courseplaysteps.user_click_on_the_profile(Courseplaysteps.java:12688)\r\n\tat ✽.Given User click on the profile(CoursePlay.feature:1849)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Courseplaysteps.user_Click_on_Logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 213407800,
  "status": "passed"
});
});