package org.properties_logfile;

import static org.properties_logfile.Utility.getProperty;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Builder3 {

	static PrintStream p=null ;
	
	
	
	
	public static RequestSpecification requestSpecBuilder() throws FileNotFoundException {
		
		if(p==null) {
			 p = new PrintStream("log.txt");
		}
		
		
		PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
		auth.setUserName(getProperty("username"));
		auth.setPassword(getProperty("password"));
             RequestSpecBuilder reqSpec= new RequestSpecBuilder(); 
             reqSpec.addFilter(RequestLoggingFilter.logRequestTo(p));
             
             reqSpec.setBaseUri(getProperty("baseuri"))
             .setContentType(ContentType.JSON)
             .setAuth(auth);
             
             RequestSpecification build = reqSpec.build();
			return build;
		

	}
	
}
