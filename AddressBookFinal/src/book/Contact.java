package book;

public class Contact {
	
	private String name; // Stores name of Contact
	private String lname;//
    private int phonenumber; // Stores phone number of contact
    private String email;

    // Creates Contact object based on parameters.
    public Contact(String n, String l, int p, String e) {
		name = n;
		lname = l;
		phonenumber = p;
		email = e;
    }

    
    // Returns the name of a Contact
    public String getName() {
		return name;
    }
    
    public String getLastName() {
    	return lname;
    }


    // Returns the phone number of a Contact
    public int getNumber() {
		return phonenumber;
    }
    // Returns the email of Contact
    public String getEmail() {
    	return email;
    }

    // Prints all information about a contact out.
    public String toString() {
        return  "Name: " + name + " Last Name: " + "Phone#: " + phonenumber +
                " E-mail: " + email;
    }

}
