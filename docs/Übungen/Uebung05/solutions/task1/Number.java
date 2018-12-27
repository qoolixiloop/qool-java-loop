public class Number {
	private byte number = 0;
	
	
	public void setNumber(int number) {
		if (number < -128) {
			System.out.println(number + " is too small to store!");
			this.number = -1;
		} else if (number > 127) {
			System.out.println(number + " is too large to store!");
			this.number = -1;
		} else {
			this.number = (byte) number;
		}
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
	
	public boolean isSmallerThanOrEquals(Number other) {
		return isSmallerThan(other) || equals(other);
	}
	
	public boolean isLargerThan(Number other) {
		return !isSmallerThan(other) && !equals(other);
	}
	
	public boolean isLargerThanOrEquals(Number other) {
		return isLargerThan(other) || equals(other);
	}
	
}
