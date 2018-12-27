package addressbook;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Contact {
	
	private long id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String street;
	private String zip;
	private String city;
	
	private Date birthday;
	
	private Contact() {
		id = System.nanoTime();
	}
	
	public Contact(String firstName, String lastName) {
		this();
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmailAdress(String email) {
		this.email = email;
	}

	public void setStreetAddress(String street, String zip, String city) {
		this.street = street;
		this.zip = zip;
		this.city = city;
	}
	
	public void setBirthday(int day, int month, int year) {
		// Calendar.getInstance() returns an instance of a subclass of Calendar,
		// based on the locally used calendar type
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		// converting date to Unix time representation
		birthday = calendar.getTime();
	}

	public Date getBirthday() {
		return birthday;
	}
	
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
