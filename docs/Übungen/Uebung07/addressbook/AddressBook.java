package addressbook;

import java.util.Arrays;

public class AddressBook {

  private Contact[] contacts;

  private int size;

  public AddressBook(int capacity) {
    contacts = new Contact[capacity];
    size = 0;
  }

  public int size() {
    return size;
  }

  public void addContact(Contact contact) {
    contacts[size] = contact;
    size++;
  }

  public Contact addContact(String firstName, String lastName) {
    Contact contact = new Contact(firstName, lastName);
    addContact(contact);
    return contact;
  }

  public Contact[] getContacts() {
    return Arrays.copyOf(contacts, size); // returning copy of contacts array
  }

  public void deleteContact(Contact contact) {
    for (int i = 0; i < size; i++) {
      if (contacts[i].equals(contact)) {
        remove(i--); // i--: correcting left shift in remove/merge methods
        // in order to still iterate over whole array
      }
    }
  }

  public Contact findById(long id) {
    for (int i = 0; i < size; i++) {
      Contact candidate = contacts[i];
      long candidateId = candidate.getId();
      if (id == candidateId) {
        return candidate;
      }
    }
    return null;
  }

  public Contact findByLastName(String lastName) {
    for (int i = 0; i < size; i++) {
      Contact candidate = contacts[i];
      String candidateLastName = candidate.getLastName();
      if (lastName.equals(candidateLastName)) {
        return candidate;
      }
    }

    return null;
  }

  private void remove(int index) {
    Contact[] head = Arrays.copyOfRange(contacts, 0, index);
    Contact[] tail = Arrays.copyOfRange(contacts, index + 1, size);

    // removing Contact at index;
    // reducing contacts array length by shifting all elements
    // right of index to left and not leaving empty slots at end of array
    contacts = merge(head, tail);
    size--;
  }

  private Contact[] merge(Contact[] head, Contact[] tail) {
    Contact[] merged = new Contact[head.length + tail.length];

    for (int i = 0; i < head.length; i++) {
      merged[i] = head[i];
    }

    for (int i = 0; i < tail.length; i++) {
      merged[i + head.length] = tail[i];
    }
    return merged;
  }

  // You might notice the two following functions are nearly identical. This
  // is a good example for why we need polymorphism! We really want to re-use
  // the sorting algorithm any only specify a comparator.
  public void sortByLastName() {
    boolean swapped = true;
    int j = 0;
    Contact tmp;
    while (swapped) {
      swapped = false;
      j++;
      for (int i = 0; i < this.size() - j; i++) {
        if (contacts[i].getLastName().compareTo(contacts[i + 1].getLastName()) > 0) {
          tmp = contacts[i];
          contacts[i] = contacts[i + 1];
          contacts[i + 1] = tmp;
          swapped = true;
        }
      }
    }
  }

  public void sortByAge() {
    boolean swapped = true;
    int j = 0;
    Contact tmp;
    while (swapped) {
      swapped = false;
      j++;
      for (int i = 0; i < this.size() - j; i++) {
        if (contacts[i].getBirthday().compareTo(contacts[i + 1].getBirthday()) < 0) {
          tmp = contacts[i];
          contacts[i] = contacts[i + 1];
          contacts[i + 1] = tmp;
          swapped = true;
        }
      }
    }
  }

}
