package org.deserialize;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Deserialization_Api {
	// DEserialization----from JAVA to Json format-- updloading data
	
	//=================Post==============
	public static void main(String[] args) {
		
	
	RestAssured.baseURI = "https://reqres.in/" ;
//	
//	Response post = RestAssured.given()
//	           .header("Content-Type", "application/json")
//	           .body(PayLoad.updateUser1())
//	           .when()
//	           .post("api/users");
//	          
//	GetDetails as = post.as(GetDetails.class);
//	
//	System.out.println(as.getName());
//	System.out.println(as.getCreatedAt());
//	System.out.println(as.getId());
//	System.out.println(as.getJob());

	
	//========================PUT==============
//	Response put = RestAssured.given()
//			       .header("Content-Type","application/json")
//			       .body(PayLoad.putUser())
//			       .when()
//			       .put("api/users/2");
//	
//	        PutNow as = put.as(PutNow.class);
//	        System.out.println(as.getJob());
//	        System.out.println(as.getName());
//	        System.out.println(as.getUpdatedAt());

	      //====================Post-JIRA=================
	        
	        
	        RestAssured.baseURI= "https://sasik288120.atlassian.net/";
	        
	        Response post1 = RestAssured.given()
	        .header("Content-Type","application/json")
	        .body(PayLoad.createIssue1())
	        .auth()
	        .preemptive()
	    	.basic("sasik288120@gmail.com", "ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
	        .when()
	        .post("rest/api/2/issue/");
	        
	      PostJira as2 = post1.as(PostJira.class);
	      System.out.println(as2.getId());
	      System.out.println(as2.getKey());
	      System.out.println(as2.getSelf());
}}
