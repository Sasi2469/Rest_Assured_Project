package org.serialize;

import org.restti.PayLoad;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Jira_serialize {

	public static void main(String[] args) {
		
		RestAssured.baseURI= "https://sasik288120.atlassian.net/";
		//=====================JIRA-PUT================================
//		Response response = RestAssured.given()
//		.header("Content-Type","application/json")
//		.body(PayLoad.putIssue())
//		.auth()
//		.preemptive()
//		.basic("sasik288120@gmail.com", "ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
//		.when()
//		.put("rest/api/2/issue/KAN-5");
//		
//		System.out.println(response.getBody().asString());
//		
//		
		//=======================POST===========================
		
		Response response1 = RestAssured.given()
				             .header("Content-Type","application/json")
				             .body(PayLoad.createIssue())
				             .auth()
				             .preemptive()
				     		.basic("sasik288120@gmail.com", "ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
		                    .when()
		                    .post("rest/api/2/issue/");
	//	System.out.println(response1.getBody().asString());
		
		Create_Issue as = response1.as(Create_Issue.class);
		
		
		System.out.println(as.getId());
		System.out.println(as.getKey());
		System.out.println(as.getSelf());
		
	
		
		
		
		

	}
	
}
