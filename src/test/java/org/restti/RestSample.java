package org.restti;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestSample extends UtilityClass {

	public static void main(String[] args) {
		
		
		//normal request way-1
		
//		RestAssured ra = new RestAssured();
//		
//		Response response = ra.get("https://reqres.in/api/users/2");
//		
//		
//		String asString = response.asString();
//		
//		System.out.println(asString);
//		
//		int statusCode = response.getStatusCode();
//		
//		System.out.println(statusCode);
//		
//		ResponseBody body = response.getBody();
//		
//		System.out.println(body.asString());
//		
		
		//way-2(Get method)
		RestAssured.baseURI = "https://reqres.in/" ;
//		
//		Response response = RestAssured.given()
//		.header("Content-Type","application/json")
//		.queryParam("page", "2")
//		.queryParam("id", "10")
//		.when()
//	    .get("api/users");
//		
//		System.out.println(response.asString());
//		
//		System.out.println(response.getStatusCode());
//		
//		System.out.println(response.getBody().asString());
//		
		
		//Post method
		
		Response response1 = RestAssured.given()
		.header("Content-Type", "application/json")
		.body(PayLoad.createUser())
		.when()
		.post("api/register");
		
       System.out.println(response1.asString());
		
		System.out.println(response1.getStatusCode());
		
		System.out.println(response1.getBody().asString());
		
		//Put method
		Response response13 =	RestAssured.given()
		.header("Content-Type","application/json")
		.body(PayLoad.updateUser())
		.when()
		.put("api/users/2");
		
		  System.out.println(response13.asString());
			
			System.out.println(response13.getStatusCode());
			
			System.out.println(response13.getBody().asString());
			
		//Delete method
		
		Response response12 = RestAssured.given()
		.header("Content-Type","application/json")
		.when()
		.delete("api/users/2");
		
		System.out.println(response12.asString());
		
		System.out.println(UtilityClass.getResponseCode(response12));
		
		System.out.println(UtilityClass.getResponseBody(response12));
		
		
		
		
		
	}
	
	
}
