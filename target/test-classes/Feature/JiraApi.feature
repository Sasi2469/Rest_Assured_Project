Feature: To validate the Jira_Api

Scenario: To validate create issue in Jira_Api using Post_Request method
Given  Add request Specification for the request
And Add payload for the Post_Request
When Add endpoint to the "post" Request
Then Validate the Response_status_code for the Request as 201
And Validate Response_Body contains self_key as "KAN" 

Scenario: To validate the update issue in Jira_API using Put_Request_Method
Given Add request Specification for the request
And Add payload for the put request
When Add endpoint to the "put" Request
Then Validate the Response_status_code for the Request as 204

Scenario: To validate the retrieve issue in Jira_Api using Get_Request_Method
Given Add request Specification for the request
When Add endpoint to the "get" Request
Then Validate the Response_status_code for the Request as 200


Scenario: To validate the delete issue in Jira_Api using Delete_Request_Method
Given Add request Specification for the request 
When Add endpoint to the "delete" Request
Then Validate the Response_status_code for the Request as 204