package org.builder;

import org.junit.Test;
import static org.builder.Builder.*;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType.*;
import static org.hamcrest.Matchers.*;


import org.junit.*;

public class Jira_Assert_Valid {


	
	@Test
	public void test1() {
		System.out.println("=======Get=============");
		
		
		Response resGet = RestAssured.given()
		.spec(requestSpecBuilder())
        
        .when()
        .get("rest/api/2/issue/KAN-41")
		.then()
		.spec(responseSpecBuilder(200))
		.body("key",containsString("KAN-41"))
		.extract().response();
		
		System.out.println(resGet.getStatusCode());
		System.out.println(resGet.getBody().asString());
		
	//	Assert.assertEquals("Statuc is not matching",200,resGet.getStatusCode()  );
	//	Assert.assertTrue("expected string is present",resGet.getBody().asString().contains("KAN-41") );
	
	}
	
	@Test
	public void test2() {
		System.out.println("=======Post=============");
		RestAssured.baseURI="https://sasik288120.atlassian.net/";
		Response resPost = RestAssured.given()
		.header("Content-Type","application/json")
		.auth()
		.preemptive()
		.basic("sasik288120@gmail.com", "ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9")
		.body("{\r\n" + 
				"    \"fields\": {\r\n" + 
				"       \"project\":\r\n" + 
				"       {\r\n" + 
				"          \"key\": \"KAN\"\r\n" + 
				"       },\r\n" + 
				"       \"summary\": \"Login page not loading fully.\",\r\n" + 
				"       \"description\": \"when clicking login page button the login page not opening fully\",\r\n" + 
				"       \"issuetype\": {\r\n" + 
				"          \"name\": \"Bug\"\r\n" + 
				"       }\r\n" + 
				"   }\r\n" + 
				"}")
		.when()
		.post("rest/api/2/issue/")
		.then()
		.assertThat()
		.statusCode(201)
		.body("key",containsString("KAN") ).extract().response();
		
		
		System.out.println(resPost.getStatusCode());
		System.out.println(resPost.getBody().asString());
	}
	
}
