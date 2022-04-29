package pojo;

public class checkLogin {

	
	private String userName;
	private String password;
	private int ldapSecurityMode;
	private String ldapDomain;
	private String trusted;
	private boolean adfsEnabled;
	private String adfsurl;
	private String ldapAuthURL;
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getuserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setldapSecurityMode(int ldapSecurityMode) {
		this.ldapSecurityMode=ldapSecurityMode;
		
	}
	
	public int getldapSecurityMode() {
		return ldapSecurityMode;
	}
	
	public void setldapDomain(String ldapDomain) {
		this.ldapDomain = ldapDomain;
	}
	
	public String getldapDomain() {
		return ldapDomain;
	}
	
	public void settrusted(String trusted) {
		this.trusted = trusted;
	}
	
	public String getTrusted() {
		return trusted;
	}
	
	public void setadfsEnabled(boolean adfsEnabled) {
		this.adfsEnabled = adfsEnabled;
	}
	
	public boolean getAdfsEnabled() {
		return adfsEnabled;
	}
	
	public void setadfsurl(String adfsurl) {
		this.adfsurl = adfsurl;
	}
	
	public String getAdfsurl() {
		return adfsurl;
	}
	
	public void setldapAuthURL(String ldapAuthURL) {
		this.ldapAuthURL=ldapAuthURL;
	}
	
	public String getldapAuthURL() {
		return ldapAuthURL;
	}
}
