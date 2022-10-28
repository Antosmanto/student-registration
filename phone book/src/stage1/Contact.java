package stage1;
//the is class is part of an application that simulates a mobile phone contacts app 
//this class is a blueprint and will be used by two other classes.
//the variables are private for security(needs encapsulation) 
//as fields are private and not visible, getter and setter are used to encapsulate the data
//the class has two constructors
//one constructor will initialize its parameters
//the other constructor is used in this class to pass data throw to other classes and take input.
//the default toString has been overridden in this class

public class Contact {//start class
	//declare private fields, private=secure
	private String contactName;
	private String contactNumber;
	//this constructor will initialize the two parameters in it
	public Contact(String contactName, String contactNumber) {// start constructor
		this.contactName = contactName;
		this.contactNumber = contactNumber;
	}//End constructor
	//this is an empty constructor, for data input
	public Contact() {}//end constructor
	//these are getters and setters, they encapsulate the private fields.
	public String getContactName() {//start get
		return contactName;
	}//End get
	public void setContactName(String contactName) {//start set
		this.contactName = contactName;
	}//End set
	public String getContactNumber() {//start get
		return contactNumber;
	}//end get
	public void setContactNumber(String contactNumber) {//start set
		this.contactNumber = contactNumber;
	}//end set
	// Overrides the toString provided by the Object class.
	@Override
	public String toString() {//start toString
		return "  Name: " + contactName + ",\t  Number: " + contactNumber +"\tContact" ;
	}//end toString
}//end class
