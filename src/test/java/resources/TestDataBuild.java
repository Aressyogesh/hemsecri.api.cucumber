package resources;

import pojo.checkLogin;

public class TestDataBuild {

	
	public checkLogin checkLoginPayload() {
		
		checkLogin login = new checkLogin();
	    login.setUserName("admin");
	    login.setPassword("super");
	    login.setldapSecurityMode(0);
	    login.setldapDomain("");
	    login.settrusted("");
	    login.setadfsEnabled(false);
	    login.setadfsurl("");
	    login.setldapAuthURL("");
	    return login;
		
	}
	
	
public checkLogin checkDataDrivenLoginPayload(String userName, String password) {
		
		checkLogin login = new checkLogin();
	    login.setUserName(userName);
	    login.setPassword(password);
	    login.setldapSecurityMode(0);
	    login.setldapDomain("");
	    login.settrusted("");
	    login.setadfsEnabled(true);
	    login.setadfsurl("");
	    login.setldapAuthURL("");
	    return login;
		
	}
}
