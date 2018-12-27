package solutions.taskAddressBook;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 *	Class to store contact information, such as addresses, email, birthday.
 */
public class Contact {
	
	private static int contactCounter = 0;
	
	private int id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String street;
	private String zip;
	private String city;
	
	private Date birthday;
	
	private Contact() {
		id = ++contactCounter;
	}
	
	/**
	 * Creating new Contact object with first and last name.
	 * 
	 * @param firstName
	 * 			First name to set.
	 * @param lastName
	 * 			Last name to set.
	 * @throws IllegalArgumentException
	 * 			if one name isn't specified (null or "").
	 */
	public Contact(String firstName, String lastName) throws IllegalArgumentException {
		this();
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	/**
	 * Returns internal id.
	 * @return
	 * 			id as int.
	 */
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets first name.
	 * 
	 * @param firstName
	 * 			First name to set.
	 * @throws IllegalArgumentException
	 * 			if name isn't specified (null or "").
	 */
	public void setFirstName(String firstName) throws IllegalArgumentException {
		if(firstName == null) {
			throw new IllegalArgumentException("First name must be specified");
		} else if(firstName.equals("")) {		
			throw new IllegalArgumentException("First name can't be empty string");
		} else {
			this.firstName = firstName;			
		}
	}
	
	public String getLastName() {
		return lastName;			
	}

	/**
	 * Sets last name.
	 * 
	 * @param lastName
	 * 			Last name to set.
	 * @throws IllegalArgumentException
	 * 			if name isn't specified (null or "").
	 */
	public void setLastName(String lastName) throws IllegalArgumentException {
		if(lastName == null) {
			throw new IllegalArgumentException("Last name must be specified");
		} else if(lastName.equals("")) {			
			throw new IllegalArgumentException("Last name can't be empty string");
		} else {
			this.lastName = lastName;
		}
	}
	
	public String getEmailAddress() {
		return email;
	}
	
	/**
	 * Sets email address.
	 * 
	 * @param email
	 * 			Address to be set.
	 */
	public void setEmailAddress(String email) {
		this.email = email;
	}
	

	/**
	 * Sets street, zip and city.
	 * 
	 * @param street
	 * 			Street to set.
	 * @param zip
	 * 			Zip to set.
	 * @param city
	 * 			City to set.
	 */
	public void setStreetAddress(String street, String zip, String city) {
		this.street = street;
		this.zip = zip;
		this.city = city;
	}
	
	/**
	 * Sets birthday.
	 * 
	 * @param day
	 * 			Day to set.
	 * @param month
	 * 			Month to set.
	 * @param year
	 * 			Year to set.
	 * @throws IllegalArgumentException
	 * 			if invalid date is passed.
	 */
	public void setBirthday(int day, int month, int year) throws IllegalArgumentException {
		// Calendar.getInstance() returns an instance of a subclass of Calendar,
		// based on the locally used calendar type
		Calendar calendar = Calendar.getInstance();
		calendar.setLenient(false); //restricts Calendar to accept valid dates
		calendar.set(year, month - 1, day); //calendar.set() throws IllegalArgumentException if input not valid
		birthday = calendar.getTime(); // converting date to Unix time representation
	}
	
	/**
	 * Returns a String representation of the Contact object.
	 * 
	 * @return
	 * 			String containing all set information.
	 */
	@Override
	public String toString() {
		// StringBuilder allows appending more Strings
		StringBuilder builder = new StringBuilder();
		
		builder.append(id).append(".\t")
			   .append(firstName).append(' ').append(lastName);			   
		
		if(birthday != null) {
			// With SimpleDateFormat, it is possible to 
			// format Date into desired String representation
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			builder.append('\n').append('\t')
				   .append(df.format(birthday));
		}
		
		if(email != null) {
			builder.append('\n').append('\t')
				   .append(email);
		}
		
		if(street != null && zip != null && city != null) {
			builder.append('\n').append('\t')
				   .append(street)
				   .append('\n').append('\t')
				   .append(zip).append(' ').append(city);
		}
		
		
		return builder.toString();
	}
	
}
