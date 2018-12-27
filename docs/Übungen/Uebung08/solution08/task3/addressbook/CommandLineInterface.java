package addressbook;

import java.util.Scanner;

public class CommandLineInterface {
	
	private AddressBook book;

	// Stores Contact currently selected in user interface
	private Contact currentSelection;

	public CommandLineInterface(AddressBook book) {
		this.book = book;
	}

	public void run() {
		Scanner in = new Scanner(System.in);

		// do-while loop is essentially the same as do loop,
		// but executes the loop at least once
		boolean quit = false;
		do {
			showMenu();						// asking for user input by displaying options
			int choice = in.nextInt();		// storing user input

			switch (choice) {
			case 1:
				addContact(askForName(in));
				break;
			case 2:
				setCurrentSelection(askForSelection(in));
				break;
			case 3:
				deleteCurrentSelection();
				break;
			case 4:
				printAllContacts();
				break;
			case 5:
				shutdown();
				quit = true;
				break;
			default:
				error();
				break;
			}
		} while (!quit);	// notice the closing semicolon ;
		
		in.close(); // free resources; unbind keyboard input from this process
	}

	private void error() {
		System.out.println("Unrecognized choice.");
		showMenu();
	}

	private void shutdown() {
		book = null;
		currentSelection = null;
		
		System.out.println("Exiting...");
	}

	private void setCurrentSelection(long nr) {
		currentSelection = book.findById(nr);
	}

	private long askForSelection(Scanner in) {
		System.out.println("Select one of the following contacts by number: ");
		printAllContacts();

		System.out.println("Which contact do you want to select?");
		long nr = in.nextLong();
		return nr;
	}

	private void addContact(String[] name) {
		currentSelection = book.addContact(name[0], name[1]);
	}

	private String[] askForName(Scanner in) {
		String[] name = new String[2];
		System.out.println("Enter a first name: ");
		name[0] = in.next();
		System.out.println("Enter a last name: ");
		name[1] = in.next();
		return name;
	}

	private void deleteCurrentSelection() {
		book.deleteContact(currentSelection);
		currentSelection = null;
		System.out.println("Deleted.");
	}

	private void showMenu() {
		System.out.println("Make your choice: ");
		System.out.println("1. Add new contact.");
		System.out.println("2. Select existing contact.");
		System.out.println("3. Delete current selection.");
		System.out.println("4. List all contacts.");
		System.out.println("5. Quit the application.");
	}

	private void printAllContacts() {
		System.out.println("---");

		Contact[] contacts = book.getContacts();
		for (Contact contact : contacts) {		// equivalent to: for(int i = 0; i < contacts.length; i++)
			System.out.println(contact);
			System.out.println("---");
		}
	}
}
