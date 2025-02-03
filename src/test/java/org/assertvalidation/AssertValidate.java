package org.assertvalidation;

import org.junit.*;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class AssertValidate {
	
	@Test
	public void Test1() {
		System.out.println("==================Get=============");
		RestAssured.baseURI="https://reqres.in/";
		Response resGet = RestAssured.given()
		           .header("Content-Type","application/json")
		           .when()
		           .get("api/users/2");
		           
		
		PutGet as = resGet.as(PutGet.class);
		Data data = as.getData();
		System.out.println(data.getEmail());
		System.out.println(data.getEmail().equalsIgnoreCase("janet.weaver@reqres.in"));
	        System.out.println(resGet.statusCode());
	        System.out.println(resGet.body().asString());
	        
             Assert.assertEquals("response code is "+resGet.statusCode()+"instead of 200",200 , resGet.statusCode());
	         Assert.assertTrue("required string is not present", data.getEmail().equalsIgnoreCase("janet.weaver@reqres.in"));
             
	}
	
	
	@Test
	public void Test2() {
		System.out.println("==================Post=============");
		RestAssured.baseURI="https://reqres.in/";
		Response resPost = RestAssured.given()
		           .header("Content-Type","application/json")
		           .body("{\r\n" + 
		           		"    \"name\": \"morpheus\",\r\n" + 
		           		"    \"job\": \"leader\"\r\n" + 
		           		"}")
		           .when()
		           .post("api/users");
		
		ResPostMet as = resPost.as(ResPostMet.class);
		String job = as.getJob();
		
		
		System.out.println(resPost.statusCode());
        System.out.println(resPost.body().asString());
        Assert.assertEquals("status code didnt match the expectation",201,resPost.statusCode());
        Assert.assertTrue("required string is not present", as.getJob().equals("leader"));

	}
	
	@Test
	public void Test3() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		 Response resPut = RestAssured.given()
		 .header("Content-Type","application/json")
		 .when()
		 .put("api/users")
		 .then()
		 .assertThat().statusCode(404)
		 .extract().response();
		 
		 
		 
		 
  
	}
}
