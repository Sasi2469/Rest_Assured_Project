package org.stepdefinition;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks  {

	 @Before("@deleteissue or @updateissue or @getissue" )
	 public void setup() throws IOException  {
		StepDefinition steps = new StepDefinition();
               steps.add_request_Specification_for_the_request();
               steps.add_payload_for_the_post_request();
               steps.add_endpoint_to_the_Request("post");
            
               
               
	}
}
