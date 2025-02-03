package org.assertvalidation;

import static org.properties_logfile.Utility.getProperty;

import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SpecBuilder {

	
	public static RequestSpecification requestSpecBuilder() {
		PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
		auth.setUserName(getProperty("username"));
		auth.setPassword(getProperty("password"));
		
		    
             RequestSpecBuilder reqSpec= new RequestSpecBuilder(); 
             reqSpec.setBaseUri(getProperty("baseuri"))
             
             .setContentType(ContentType.JSON)
             .setAuth(auth);
             
             RequestSpecification build = reqSpec.build();
			return build;
		

	}
	
	
}
