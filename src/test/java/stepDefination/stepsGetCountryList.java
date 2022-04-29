package stepDefination;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.cucumber.java.da.Givet;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class stepsGetCountryList extends Utils {

	/*
	 * RequestSpecification res; ResponseSpecification resspec; Response response;
	 */
	TestDataBuild data = new TestDataBuild();
	
	
	@Givet("Country List")
	public void country_list() throws IOException {
	res = given().spec(requestSpecification()).header("Authorization", "Bearer "+token);
	System.out.println("Bearer_Token" +token);
	}


}
