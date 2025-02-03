package org.serialize;

import org.restti.PayLoad;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Serialization_Demo {
// serialization----from JSON to java format
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI = "https://reqres.in/" ;
		
		//===========================(GET)=====================
		System.out.println("====================get==============");
		Response response = RestAssured.given()
		.header("Content-Type","application/json")
		.queryParam("page", "2")
		.queryParam("id", "10")
		.when()
	    .get("api/users");
		
		Root as = response.as(Root.class);
		
		Data data = as.getData();
		
		System.out.println(data.getId());
		System.out.println(data.getFirst_name());
		System.out.println(data.getLast_name());
		System.out.println(data.getEmail());
		System.out.println(data.getAvatar());

		Support support = as.getSupport();
		System.out.println(support.getUrl());
		System.out.println(support.getText());
		
//		System.out.println(response.asString());
//		
//		System.out.println(response.getStatusCode());
//		
//		System.out.println(response.getBody().asString());
		
		
		//=================(POST)=============================
//		Response response1 = RestAssured.given()
//				.header("Content-Type", "application/json")
//				.body(PayLoad.createUser())
//				.when()
//				.post("api/register");
				
//		       System.out.println(response1.asString());
//				
//				System.out.println(response1.getStatusCode());
//				
//				System.out.println(response1.getBody().asString());
		
		
				
				//=========================(Put method)===================
		System.out.println("====================put==============");
		
				Response response13 =	RestAssured.given()
				.header("Content-Type","application/json")
				.body(PayLoad.updateUser())
				.when()
				.put("api/users/2");
				
				UpdateUser as2 = response13.as(UpdateUser.class);
				
				System.out.println(as2.getName());
				System.out.println(as2.getJob());
				System.out.println(as2.getUpdatedAt());
				
//				  System.out.println(response13.asString());
//					
//					System.out.println(response13.getStatusCode());
//					
//					System.out.println(response13.getBody().asString());
					
		
		
		
		
	}
	
	
}
