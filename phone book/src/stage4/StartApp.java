package stage4;
import stage1.Friend;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import stage1.Contact;

//the is class is part of an application that simulates a mobile phone contacts app 
//this is the start of the application
//this is an entry=point
//this class creates an object of Contact
//this class takes input using the scanner
//this class hold a database (array list) for the mobile phone contacts app
//this class uses methods to allow the user to add or remove contacts to the database
//this class uses methods to allow the user to view the database, sort it alphabetically and print to a text file. 


public class StartApp {//start class
	//make reference to the scanner
	static Scanner input = new Scanner(System.in);	
	//make reference to Contact class
	//create an objects of Contact
	static Contact contact = new Contact();	
	static Contact friend= new Friend();
	//create ArrayList to hold the information
	static ArrayList<Contact> addedContacts= new ArrayList<>();
	public static void main(String[] args) {//start main
		System.out.println("welcome to Blu Contacts");
		while(true) {//start while loop
			//switch statement to test the ArrayLists
			System.out.println("Please choose an options from the menu:");
			System.out.println(" ********************************************************************************************************************************");	
			System.out.println("| 1 Add Contact | 2 Remove Contact | 3 View Contacts | 4 Sort Contacts Alphabetically | 5 Print Contacts to Note Pad | 6 Log Out |");
			System.out.println(" ********************************************************************************************************************************");
			String choice = input.next();
			switch(choice){//start switch
			case "1":addContacts();break;
			case "2":removeContacts();break;
			case "3":viewContacts();break;
			case "4":sortAlphabetically();break;
			case "5":saveContactsToFile();break;
			case "6":logOut();break;
			default: System.out.println("Invald choice, please choose again.");				
			}//end switch
		}//end while loop		
	}//end main
	//method to print contact to a file
	private static void saveContactsToFile() {// start method
		System.out.println("Successfully Printed To Notepad!");
		//create a text file called phone book
		Path path = Paths.get("phonebookContacts.txt");//Using Paths from Java 8
		String text = addedContacts.toString();
		try {//start try
			Files.write(path, text.getBytes());
		}//end try
		catch (IOException e) {//start try			
			e.printStackTrace();
		}//end try catch		
	}//end method
	private static void logOut() {//start method
		System.out.println("Thank you for using Blu Contacts");
		System.exit(0);		
	}//end end
	//this method will sort the phone book 
	private static void sortAlphabetically() {//start method
		addedContacts.sort((Contact s1,Contact s2)->s1.getContactName().compareTo(s2.getContactName()));		
	}//end method
	//this method removes contacts from the phone book
	private static void removeContacts() {//start method
		System.out.println("Please enter name to remove");
		String name= input.next();
		for(int i = 0;i<addedContacts.size();i++) {
			if(name.matches(addedContacts.get(i).getContactName())) {
				addedContacts.remove(i);
			}//end if
		}//end for		
	}//end the method
	//This method is to view the contacts
	private static void viewContacts() {// start method
		addedContacts.forEach(System.out::println);		
	}//end method
	//this method is to add all numbers to the phone book and define them as a friend or contact.
	private static void addContacts() {// start method		
		while (true) {//start while loop
			//switch statement to test the ArrayLists			
			System.out.println("Is this a Friend's number?");
			System.out.println("yes / no");
			String ans = input.next();
			switch(ans) {//start switch
			case "yes":addFriend();break;
			case "no":addContact();break;
			default:System.out.println("Invald entry, please enter Yes or No only.\nEntries are case sensitive");
			}//end switch
		}//end while loop		
	}//end method
	//method to add a number to the phone book as a contact
	private static void addContact() {//start method
		System.out.println("Please enter contact's name");
		String name= input.next();
		System.out.println("please enter contact's phone number");
		String number= input.next();
		addedContacts.add(new Contact(name,number));
		main(null);
	}//end method
	//method to add a number to the phone book as a friend 
	private static void addFriend() {//start method
		System.out.println("Please enter contact's name");
		String name= input.next();
		System.out.println("please enter contact's phone number");
		String number= input.next();
		addedContacts.add(new Friend(name,number));
		main(null);
	}//end method
}//end class
