Feature: To validate the Jira_Api
Background:
Given  Add request Specification for the request


@createissue
Scenario: To validate create issue in Jira_Api using Post_Request method
And Add payload for the Post_Request
When Add endpoint to the "post" Request
Then Validate the Response_status_code for the Request as 201
And Validate Response_Body contains self_key as "KAN" 

@updateissue
Scenario: To validate the update issue in Jira_API using Put_Request_Method
And Add payload for the put request
When Add endpoint to the "put" Request
Then Validate the Response_status_code for the Request as 204

@getissue
Scenario: To validate the retrieve issue in Jira_Api using Get_Request_Method
When Add endpoint to the "get" Request
Then Validate the Response_status_code for the Request as 200

@deleteissue
Scenario: To validate the delete issue in Jira_Api using Delete_Request_Method
When Add endpoint to the "delete" Request
Then Validate the Response_status_code for the Request as 204

@createissue
Scenario Outline: To validate create issue in Jira_Api using Post_Request method
And Add payload for the Post_Request with "<description>" and "<summary>"
When Add endpoint to the "post" Request
Then Validate the Response_status_code for the Request as 201
And Validate Response_Body contains self_key as "KAN" 

Examples:
     |description|summary|
     |Clicking login page button not going to login page1|LoginPage button issue1|
     |Clicking login page button not going to login page2|LoginPage button issue2|
     |Clicking login page button not going to login page3|LoginPage button issue3|



