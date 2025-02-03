package org.stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.stepdefinition.PayLoad.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.hamcrest.Matchers;
import org.junit.Assert;

import static org.stepdefinition.SpecBuilder2.*;

public class StepDefinition {

	RequestSpecification reqSpecifi;
	Response resSpecifi;
	static String key;

	@Given("Add request Specification for the request")
	public void add_request_Specification_for_the_request() throws IOException {
		reqSpecifi = RestAssured.given().log().all().spec(requestSpecBuilder());
	}

	@Given("Add payload for the Post_Request")
	public void add_payload_for_the_post_request() {
		reqSpecifi.body(createIssue8());
	}

	@Then("Validate the Response_status_code for the Request as {int}")
	public void validate_the_response_status_code_for_the_request_as(Integer expectedStatuscode) {
		resSpecifi = resSpecifi.then().log().all().spec(responseSpecBuilder(expectedStatuscode)).extract().response();
	}

	@Then("Validate Response_Body contains self_key as {string}")
	public void validate_response_body_contains_self_key_as(String expectedKey) {
		Create_Issue as = resSpecifi.as(Create_Issue.class);
		key = as.getKey();

		Assert.assertTrue("Expected msg not matched", as.getKey().contains(expectedKey));
	}

	@Given("Add payload for the put request")
	public void add_payload_for_the_put_request() {
		reqSpecifi.body(updateIssue());
	}

	@When("Add endpoint to the {string} Request")
	public void add_endpoint_to_the_Request(String string) {
		if (string.equals("get")) {
			resSpecifi = reqSpecifi.when().get("rest/api/2/issue/" + key);
		}

		if (string.equals("put")) {
			resSpecifi = reqSpecifi.when().put("rest/api/2/issue/" + key);
		}

		if (string.equals("delete")) {
			resSpecifi = reqSpecifi.when().delete("rest/api/2/issue/" + key);
		}
		if (string.equals("post")) {
			resSpecifi = reqSpecifi.when().post("rest/api/2/issue/");
		}
	}

}
