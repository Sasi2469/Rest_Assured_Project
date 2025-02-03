package org.properties_logfile;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.properties_logfile.Builder3.*;
import static org.properties_logfile.Utility.*;

import java.io.FileNotFoundException;
public class PropertyFileAndLogFile {

	@Test
	public void test1() throws FileNotFoundException {
		System.out.println("======GetIssue=====");
		

		Response resGet =  RestAssured.given()
				.spec(requestSpecBuilder())
				.params("jql", "assignee=Sasi")
			.when().get("rest/api/2/issue/KAN-29")
                .then()
                .extract().response();
		
      	System.out.println(resGet.getBody().asString());
		System.out.println(resGet.getStatusCode());

	}

	@Test
	public void test2() throws FileNotFoundException {
		System.out.println("======GetPost=====");
		RestAssured.baseURI = getProperty("baseuri");

		Response resGet = RestAssured.given()
				.spec(requestSpecBuilder())
				.body(PayLoad2.creatIssue())
				.when().post("rest/api/2/issue/");

		System.out.println(resGet.getBody().asString());
		System.out.println(resGet.getStatusCode());
		
		

	}

}
