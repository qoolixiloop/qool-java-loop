public class NumberTestDriverOld {

	public static void main(String[] args) {
		Number x = new Number();
		Number y = new Number();
		x.setNumber(1);
		y.setNumber(3);
		
		x = y;
		
		x.printNumber();
		y.printNumber();
		
		x.setNumber(5);
		y.setNumber(7);
		
		x.printNumber();
		y.printNumber();
	}

}
