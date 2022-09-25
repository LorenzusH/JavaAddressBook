package book;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Instantiate AddressBook object
		AddressBook blackbook = new AddressBook();

 		// Menu driven loop.
		menu();
		int choice = scanner.nextInt();
		while (choice!=6) {

	    	// Only adds contact if there is room in AddressBook blackbook.
	    	if (choice == 1) {

	    		if (blackbook.numContacts() < 10) {

		    		//Reads in all appropriate information.");
		    		System.out.println("Enter new Contact\'s name:");
		    		String name = scanner.next();
		    		System.out.println("Enter new Contact\'s last name:");
		    		String lname = scanner.next();
		    		System.out.println("Enter their phone number.");
		    		int number = scanner.nextInt();
		    		System.out.println("Enter the email of Contact");
		    		String email = scanner.next();

		    		// Uses information to create Contact object, which is
		    		// a parameter to the addContact method.
		    	blackbook.addContact(new Contact(name, lname, number,email));
				}
				 else
		    		System.out.println("Sorry, can not add anyone, your blackbook is full.");
	    	}

	    	// Implements rest of the choices by calling appropriate AddressBook methods on blackbook.
	    	 if (choice == 2) {
				System.out.println("What is the name of the contact you want to delete?");
				String name = scanner.next();
				blackbook.deleteContact(name);
	    	}
	    	else if (choice == 3) {
				System.out.println("What's the contact\'s name you want to search?");
	    	 	String name = scanner.next();
	    	 	//blackbook.findContact(name);
	    	}
	    	else if (choice == 4)
				blackbook.printContacts();
	    	else if (choice == 5)
	    		blackbook.deleteContacts();
	    	else if (choice !=6)
				System.out.println("Sorry, that was an invalid menu choice, try again.");

	    	menu();
	    	choice = scanner.nextInt();
		}
	}

    public static void menu() {
		System.out.println("1.Add a new contact.");
		System.out.println("2.Delete a contact.");
		System.out.println("3.Search Contact.");
		System.out.println("4.Print Address Book");
		System.out.println("5.Delete Book.");
		System.out.println("6.Quit.");
		System.out.println("Please choose what you want to do with the database.");
    }

}
