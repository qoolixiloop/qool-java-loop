package solutions.taskAddressBook;
import java.util.ArrayList;


public class AddressBook {
	
	private ArrayList<Contact> contacts;
		
	public AddressBook(int capacity) {
		contacts = new ArrayList<Contact>();
	}
	
	public int size() {
		return contacts.size();
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	
	public Contact addContact(String firstName, String lastName) {
		Contact contact = new Contact(firstName, lastName);
		addContact(contact);
		return contact;
	}

	public Contact[] getContacts() {
		Contact[] results = new Contact[contacts.size()];
		contacts.toArray(results);
		return results; // returning contacts as array -> legacy interface
	}

	/**
	 * Deletes all occurrences of contact in address book.
	 * @param contact
	 * 				Contact to be deleted.
	 */
	public void deleteContact(Contact contact) {
		for(int i = 0; i < contacts.size(); i++) {
			if(contacts.get(i).equals(contact)) {
				contacts.remove(i--); 	// i--: correcting left shift in remove/merge methods
										// in order to still iterate over whole array
			}
		}
	}
	
	/**
	 * Returns contact with given id.
	 * @param id
	 * 			id to be searched for.
	 * @return
	 * 			Contact with given id; null if no contact found.
	 */
	public Contact findById(int id) {
		for(int i = 0; i < contacts.size(); i++) {
			Contact candidate = contacts.get(i);
			int candidateId = candidate.getId();
			if(id == candidateId) {
				return candidate;
			}
		}
		return null;
	}

	/**
	 * Returns first contact in address book array with given name.
	 * @param lastName
	 * 			Name to be searched for.
	 * @return
	 * 			Contact with given name; null if no contact found.
	 */
	public Contact findByLastName(String lastName) {
		for(int i = 0; i < contacts.size(); i++) {
			Contact candidate = contacts.get(i);
			String candidateLastName = candidate.getLastName();
			if(lastName.equals(candidateLastName)) {
				return candidate;
			}
		}
		
		return null;
	}

}
