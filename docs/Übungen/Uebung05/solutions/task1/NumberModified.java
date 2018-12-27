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
	
	...
	
}
