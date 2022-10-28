package stage1;

//the is class is part of an application that simulates a mobile phone contacts app 
//this is the start of the application
//this is an entry=point
//this class creates an object of Contact
//this class takes input using the scanner
//this class hold a database (array list) for the mobile phone contacts app
//this class uses methods to allow the user to add or remove contacts to the database
//this class uses methods to allow the user to view the database, sort it alphabetically and print to a text file. 


public class StartApp {//start class
	//make reference to Contact class
	//create an object of Contact
	static Contact contact = new Contact("Peter","0864324678");
	//create an object of friend for testing
	static Contact friend= new Friend("Jan","0834329876");
	public static void main(String[] args) {//start main
		//testing system
				System.out.println(contact.toString());
				System.out.println(friend.toString());
	}//end main

}//end class
