package phonebook;

import java.util.Scanner;



public class Home {

	public static void main(String[] args) {
		displayMenu();
		
	}
	
	public static void displayMenu() {
		
		
		//String firstName, String lastName, 
		//String fullName, int phoneNumber, Address address
		
		Person[] persons=new Person[3];
		
		//String streetName, int streetNumber, 
		//String city, String state, int zipcode)
		
		persons[0]=new Person("John","","Doe","John Doe","6366435698",new Address("114 Market St","St. Louis","MO",63403));
		persons[1]=new Person("John", "E", "Doe","John E Doe", "2175551176",new Address("1325 Main St", "Springfield", "IL", 62702));
		persons[2]=new Person("John", "","Micheal", "John Micheal", "5628592375",new Address("574 Pole ave","St Peters","MO",63333));
		
/*John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375*/

        
		
		
		Scanner in = new Scanner (System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Declare your search method by "
				+ "enetering one of the following numbers: 1,2,3,4,5 or 6" );
		System.out.println("\n1. Search a contatct using First Name?");
		System.out.println("2. Search a contatct using Last Name?");
		System.out.println("3  Search a contatct using Full Name?");
		System.out.println("4  Search a contatct using Phone Number?");
		System.out.println("5  Search a contatct using Address?");
	    System.out.println("6. Add a new contact?");
	    System.out.println("7. Delete a contact? ");
		
	    int choice = in.nextInt();
	    //in.nextLine();
	    
	    switch(choice) {
	    case 1:
	    	System.out.println("\nWho can I help you find? First Name: ");
	    	String fname=in.next();
	    	for(int i=0; i < persons.length; i++)
	    	{
	    	    if(persons[i].getFirstName().equals(fname))
	    	    {
	    	        System.out.println(persons[i].toString());
	    	    }
	    	}
	    		break;
	   
	    case 2:
		    System.out.println("\nWho can I help you find? Last Name: ");
		    for(int i=0; i < persons.length; i++)
	    	{
	    	    if(persons[i].getLastName().equals(in.nextLine()))
	    	    {
	    	        System.out.println(persons[i].toString());
	    	    }
	    	}
    		break;
	    
	    case 3:
		    System.out.println("\nWho can I help you find? Full Name: ");
		    for(int i=0; i < persons.length; i++)
	    	{
	    	    if(persons[i].getFullName().equals(in.nextLine()))
	    	    {
	    	        System.out.println(persons[i].toString());
	    	    }
	    	}
    		break;
    		
    	case 4:
		    System.out.println("\nWho can I help you find? Phone Number: ");
		    for(int i=0; i < persons.length; i++)
	    	{
	    	    if(persons[i].getPhoneNumber().equals(in.nextLine()))
	    	    {
	    	        System.out.println(persons[i].toString());
	    	    }
	    	}
    		break;
    		
    	case 5:
		    System.out.println("\nWho can I help you find? Address: ");
		    for(int i=0; i < persons.length; i++)
	    	{
	    	    if(persons[i].getAddress().printAddress().equals(in.nextLine()))
	    	    {
	    	        System.out.println(persons[i].toString());
	    	    }
	    	}
    		break;
    		
    	case 6:
		    System.out.println("\nContact you would like to add? seperate by commas (firstname, lastname....)");
		    String person=sc.nextLine();
		    String[] personArr=person.split(", ");
		    
		    Person[] persons2=new Person[persons.length+1];
		    for(int i=0; i < persons.length; i++)
		    {
		        persons2[i]=persons[i];
		    }
		    
		    String[] splitName = personArr[0].split(" ");
		    String middleName = "";
		    
		    for(int i = 1; i < splitName.length - 1; i++) {
		    	middleName += splitName[i] + " ";
		    }
		    middleName = middleName.trim();
		    
		    persons2[persons2.length-1]=new Person(splitName[0],middleName,splitName[splitName.length-1],personArr[0],personArr[5],new Address(personArr[1],personArr[2],personArr[3],Integer.parseInt(personArr[4])));
		    persons=persons2;
		    //persons.sort();
		    System.out.println("Person added Successfully");
    		break;
    		
    	case 7:
		    System.out.println("\nContact you would like to delete? ");
		    for(int i=0; i < persons.length; i++)
	    	{
	    	    if(persons[i].getPhoneNumber().equals(in.nextLine()))
	    	    {
	    	        persons[i]=null;
	    	    }
	    	}
    		break;
    		
    	default:
    			
    			break;
	    }
	}

}
