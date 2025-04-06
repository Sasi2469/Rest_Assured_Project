$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/JiraApi.feature");
formatter.feature({
  "name": "To validate the Jira_Api",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Add request Specification for the request",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.add_request_Specification_for_the_request()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the retrieve issue in Jira_Api using Get_Request_Method",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@getissue"
    }
  ]
});
formatter.step({
  "name": "Add endpoint to the \"get\" Request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.add_endpoint_to_the_Request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Response_status_code for the Request as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.validate_the_response_status_code_for_the_request_as(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Add request Specification for the request",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.add_request_Specification_for_the_request()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the delete issue in Jira_Api using Delete_Request_Method",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@deleteissue"
    }
  ]
});
formatter.step({
  "name": "Add endpoint to the \"delete\" Request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.add_endpoint_to_the_Request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Response_status_code for the Request as 204",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.validate_the_response_status_code_for_the_request_as(Integer)"
});
formatter.result({
  "status": "passed"
});
});