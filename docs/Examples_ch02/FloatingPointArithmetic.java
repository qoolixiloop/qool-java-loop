package ch02;

public class FloatingPointArithmetic {
	
	public static void main(String[] args) {
		
		double x = 1009999.232;
		double result = (1.0/x)*x - 1.0;
		System.out.println(result);
		System.out.println("Result is 0.0: "+(result == 0.0d));
		
	}
	
}
