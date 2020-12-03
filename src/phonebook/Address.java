package phonebook;


public class Address {
	
	private String streetName;
	private String city;
	private String state;
	private int zipcode;
	
	public Address(String streetName,  String city, String state, int zipcode) {
		this.streetName = streetName;
	
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public String printAddress() {
		return streetName + " " + city + " " + state + " " + zipcode;
	}

}
