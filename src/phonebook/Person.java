package phonebook;


public class Person  {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName; 
	private String phoneNumber;
	private Address address;
	
	
	public Person(String firstName, String middleName, String lastName, String fullName, String phoneNumber, Address address) {
		this.middleName=middleName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address=address;
	}
	
	
	public void findAddress(String streetName, String city, String state, int zipcode) {
		Address tempAddress = new Address(streetName, city, state, zipcode);
	}
	
	public Address getAddress()
	{
	    return address;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getFullName() {
		return fullName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String toString()
	{
	    return firstName+" "+middleName+" "+lastName+" "+address.printAddress()+" "+phoneNumber;
	}
	
}
