package org.restti;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Jira_Api_Rest  {
public static void main(String[] args) {
	//GET request in JIRA
	
	RestAssured.baseURI = "https://sasik288120.atlassian.net/" ;
	
//	Response response=RestAssured.given()
//	.header("Content-Type", "application/json")
//	.auth()
//	.preemptive()
//	.basic("sasik288120@gmail.com","ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
//	.when()
//	.get("rest/api/2/search") ;
//	
//	
//	System.out.println(UtilityClass.getResponseCode(response));
//	System.out.println(UtilityClass.getResponseBody(response));
//	
//	
//	// Get request in JIRA assignee
//	
//	System.out.println("===============================");
//	Response response1=	RestAssured.given()
//	.header("Content-Type","application/json")
//	.queryParam("jql", "assignee=Sasi")
//	.auth()
//	.preemptive()
//	.basic("sasik288120@gmail.com", "ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
//	.when()
//	.get("rest/api/2/search") ;
//	
//	System.out.println(UtilityClass.getResponseCode(response1));
//	System.out.println(UtilityClass.getResponseBody(response1));
//	
//	
//	// Get request in JIRA assignee
//	
//	System.out.println("===============================");
//	Response response2=	RestAssured.given()
//	.header("Content-Type","application/json")
//	//.queryParam("selectedIssue", "KAN-26")
//	.auth()
//	.preemptive()
//	.basic("sasik288120@gmail.com", "ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
//	.when()
//	.get("rest/api/2/issue/KAN-21") ;
//	
//
//	System.out.println(UtilityClass.getResponseCode(response2));
//	System.out.println(UtilityClass.getResponseBody(response2));
//	
//	
//	//Post request in JIRA 
//	System.out.println("===============================");
//    
	Response postresponse = RestAssured.given()
	.header("Content-Type", "application/json")
	.queryParam("jql", "assignee=Sasi")
	.auth()
    .preemptive()
    .basic("sasik288120@gmail.com","ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
	.body(PayLoad.createIssue())
    .when()
	.post("rest/api/2/issue/");
	
	System.out.println(UtilityClass.getResponseCode(postresponse));
	System.out.println(UtilityClass.getResponseBody(postresponse));
//	
	//Put request in JIRA
	System.out.println("===============================");
	Response putresponse = RestAssured.given()
	.header("Content-Type","application/json")
	.body(PayLoad.putIssue())
	.auth()
	.preemptive()
	.basic("sasik288120@gmail.com", "ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
	.when()
	.put("rest/api/2/issue/KAN-23");
	
	System.out.println(UtilityClass.getResponseCode(putresponse));
	System.out.println(UtilityClass.getResponseBody(putresponse));
	
	//Delete Issue in JIRA
//	System.out.println("===============================");
//
//	Response deleteresponse = RestAssured.given()
//	.header("Contnent-Type","application/json")
//	.auth()
//	.preemptive()
//	.basic("sasik288120@gmail.com", "ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
//	.when()
//	.delete("rest/api/3/issue/KAN-30");
//	
//	System.out.println(UtilityClass.getResponseCode(deleteresponse));
//	System.out.println(UtilityClass.getResponseBody(deleteresponse));
//	
}


}
