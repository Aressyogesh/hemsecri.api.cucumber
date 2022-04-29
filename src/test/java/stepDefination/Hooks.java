package stepDefination;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@createmanufacturer")
	public void beforeScenario() throws IOException {
		
		stepsCheckLogin m = new stepsCheckLogin();
		m.login_payload_with("admin", "super");
		m.user_calls_with_http_request("checkLoginAPI", "Post");
	}
}
