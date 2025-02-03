package org.restti;

import io.restassured.response.Response;

public class UtilityClass {

	
	public static  int getResponseCode(Response response) {
		return response.getStatusCode();
	}
	
	public static  String getResponseBody(Response response) {
		return response.getBody().asString();	
	}
	
	
	 public static void propertiesFileRead() {
		

	}
}
