package resources;


//enum is special class in java which has collections of constants and methods

public enum APIResources {

	checkLoginAPI("/api/Login/CheckLogin"),
	getCountryListAPI("/api/Manufacturer/GetCountryList"),
	AddORUpdateManufacturerDetailsAPI("/api/Manufacturer/AddOrUpdateManufacturerDetails"),
	GetManufacturerDetailsAPI("/api/Manufacturer/GetManufacturerDetails");

	private String resource;
	
	APIResources(String resource) {
		// TODO Auto-generated constructor stub
		this.resource=resource;
	}
	
	
	public String getResource() {
		return resource;
	}
}
