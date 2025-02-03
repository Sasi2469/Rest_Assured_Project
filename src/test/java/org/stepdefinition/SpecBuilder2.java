package org.stepdefinition;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder2 {
	 static	PrintStream p=null;

	public static  RequestSpecification requestSpecBuilder() throws FileNotFoundException {
	if (p==null) {
			 p = new PrintStream("log3.txt");
		}
		
		 PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
		 auth.setUserName("sasik288120@gmail.com");
		 auth.setPassword("ATATT3xFfGF0OrfCcYkmNi8qMY5MstcoafMuuP6DI0XNR2rd2XQNdXcaZVo86QnH9BO9JXPmDIlasFfv07ZIXN_SUymv7u5RYVP8_hDssriKoIa9bkZu79btAuzVMNuSc8AnAUave8l18kiBGFg0TV4YWMiuCKvepgRPIm6eZDRIhF7Cpk7DqRo=D7E79840");
	
		
		 RequestSpecification reqSpec = new RequestSpecBuilder()
				 .addFilter(RequestLoggingFilter.logRequestTo(p))
				 .addFilter(ResponseLoggingFilter.logResponseTo(p))
				 .setContentType(ContentType.JSON)
				 .setBaseUri("https://sasik288120.atlassian.net/")
		.setAuth(auth).build();
		return reqSpec;

	}
	
	
	public static ResponseSpecification responseSpecBuilder(int statuscode) {
		
		
		   ResponseSpecification build4 = new ResponseSpecBuilder()
				   .expectContentType(ContentType.JSON)
				   .expectStatusCode(statuscode).build();
		return build4;

	}
	
}
