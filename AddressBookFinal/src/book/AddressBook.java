package book;

import java.util.ArrayList;

public class AddressBook {
	
	// An array of Contacts 
	private ArrayList<Contact> contact; 

    // Create an empty AddressBook
    public AddressBook() {
        contact = new ArrayList<Contact>();
    }

    // Add a contact that's passed in as a parameter.
    public void addContact(Contact c) {
        contact.add(c);
    }
    
 // Deletes a contact from AddressBook.
    public void deleteContact(String s) {
        int place = haveContact(s);
        if (place >= 0)
            contact.remove(place);
    }
    
    //Search for Contacts
   // public void findContact(String s) {
     //  int place = haveContact(s);
    //   if (place >= 0)
      //     contact.search(place);
    
   // }
    
       

    // Prints Address Book.
    public void printContacts() {
        for (int i=0;i<contact.size();i++)
            System.out.println(contact.get(i));
    }
    
    //Deletes Address Book.
    public void deleteContacts() {
        contact.clear();
    }

    // Returns the number of contacts currently in AddressBook
    
    public int numContacts() {
     return contact.size();
   }

    // Returns a non-neg integer if a Contact with name s exists corresponding
    // to which place in the array friends the Contact is stored. Returns -1
    // otherwise.
    private int haveContact(String s) {
        for (int i=0;i<contact.size();i++)
            if (contact.get(i).getName().equals(s))
                return i;
        return -1;
    }

    
    
    

}
