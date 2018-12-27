public class NumberTestDriver {

	public static void main(String[] args) {
		Number x = new Number();
		Number y = new Number();
		x.setNumber(4);
		y.setNumber(4);
		
		x.printNumber();
		System.out.println("  compared to " + y.getNumber());
		System.out.println(x.equals(y));
		System.out.println(x.isSmallerThan(y));
		System.out.println(x.isSmallerThanOrEquals(y));
		System.out.println(x.isLargerThan(y));
		System.out.println(x.isLargerThanOrEquals(y));
	}

}
