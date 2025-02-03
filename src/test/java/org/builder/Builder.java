package org.builder;

import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Builder {

	
	public static RequestSpecification requestSpecBuilder() {
		PreemptiveBasicAuthScheme pre= new PreemptiveBasicAuthScheme();
		pre.setUserName("sasik288120@gmail.com");
		pre.setPassword("ATATT3xFfGF0rvOPtgtphIEqXP9nitL3IyimcwDBRrFFTEcbxpFVl1w2NuugSGO6yaR97vmN9fvM4EI9seWk5GCJbUhfMT_AlEcblLpU7zgEdq5bXEbkY7uuE4-CPtL3_ly_P0UjGc1-cUpHR5ZOXfdWq1bKf0oQap1EBLlvCYXJoWBz19zP8N0=A45E29D9");
		RequestSpecification build = new RequestSpecBuilder()
		.setBaseUri("https://sasik288120.atlassian.net/")
		.setContentType(ContentType.JSON)
		.setAuth(pre)
		.build();
		
		return build;
	}
	
	public static ResponseSpecification responseSpecBuilder(int statuscode) {

		ResponseSpecBuilder res = new ResponseSpecBuilder();
		res.expectContentType(ContentType.JSON)
		.expectStatusCode(200);
		
		ResponseSpecification build1 = res.build();
		return build1;
	}
	
	
	
	
}
