public class Number {
	private int number = 0;
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void printNumber() {
		System.out.println(number);
	}

	public boolean equals(Number other) {
		return this.number == other.number;
	}
	
	public boolean isSmallerThan(Number other) {
		return this.number < other.number;
	}
	
}
