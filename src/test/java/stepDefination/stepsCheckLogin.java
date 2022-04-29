package stepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.hamcrest.Matchers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.checkLogin;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;


public class stepsCheckLogin extends Utils {

	
	 //RequestSpecification res;
	 //ResponseSpecification resspec; 
	 //Response response;
	 
	TestDataBuild data = new TestDataBuild();
	
	
	@Given("Login payload")
	public void login_payload() throws IOException {
			    
	   res = given().spec(requestSpecification()).body(data.checkLoginPayload());
	
	}
	
	
	@Given("Login payload with {string} {string}")
	public void login_payload_with(String userName, String password) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	   res = given().spec(requestSpecification()).body(data.checkDataDrivenLoginPayload(userName, password));
	}

	
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
	    // Constructor will be called with value of resource which is pass
	    APIResources resourceAPI = APIResources.valueOf(resource);
	    System.out.println(resourceAPI.getResource());
	    resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	    if (method.equalsIgnoreCase("POST"))
	     response = res.when().post(resourceAPI.getResource());
		else if (method.equalsIgnoreCase("GET"))
	    	response = res.when().get(resourceAPI.getResource());
	    else if (method.equalsIgnoreCase("DELETE"))
	    	response = res.when().delete(resourceAPI.getResource());
	}
	
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	    
		assertEquals(200, response.getStatusCode());
		
	}
	
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {
	    String resp = response.asPrettyString();
	   // System.out.println(resp);
	    JsonPath js = new JsonPath(resp);
	    assertEquals(js.get(key).toString(), value);
	    	
		token = js.get("token");
		System.out.println(token);
		 
	    
	}
	
}
