package task2;

import java.util.Date;

public class Student {
	private static int id = 1;
	private String name;
	private String matriculationNumber;
	
	public Student(String name, String matriculationNumber) {
		this.name = name;
		this.matriculationNumber = matriculationNumber;
	}
	
	public Student(String name) {
		this(name, nextMatriculationNumber());
	}
	
	@Override
	public String toString() {
		return toString(' ', 1);
	}
	
	public String toString(char separator) {
		return toString(separator, 1);
	}
	
	public String toString(int horizontalSpace) {
		return toString(' ', horizontalSpace);
	}
	
	public String toString(char separator, int horizontalSpace) {
		return matriculationNumber + StringUtils.repeat(separator, horizontalSpace) + name;
	}
	
	public String toString(int horizontalSpace, char separator) {
		return toString(separator, horizontalSpace);
	}
	
	private static String nextMatriculationNumber() {
		return matriculationNumberForId(id++);
	}
	
	private static String matriculationNumberForId(int id) {
		return String.format("%1$ty-%2$03d-%3$03d", new Date(), id / 1000, id % 1000);
	}
}
