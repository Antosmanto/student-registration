package stage1;
//the is class is part of an application that simulates a mobile phone contacts app 
//this file will be used by another class
//this class is part of a blueprint for StartAtm
//this class inherits from Contact
//the class has two constructors
//one constructor will initialize its parameters
//the other constructor is used in this class to pass data throw to other classes and take input.
//the default toString has been overridden in this class

public class Friend extends Contact {//start class
	//this constructor will initialize the two parameters in it
	public Friend(String contactName, String contactNumber) {//start constructor
		super(contactName, contactNumber);
	}//end constructor
	//this is an empty constructor, for data input
	public Friend() {}//end constructor
	// Overrides the toString provided by the Object class.
	@Override
	public String toString() {//Start toString
		return   super.toString()+" Friends " ;
	}//end toString
}//End class
