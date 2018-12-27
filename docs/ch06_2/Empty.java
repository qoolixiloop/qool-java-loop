package ch06_2;

public class Empty
{
	
	private String myField;
	
	public static void main(String[] args) {
		
		Object object = new Object() { 
			public String toString(){
				return "Anonymous Class!";
			}
		};
		
		Empty empty = new Empty();
		Inner inner = empty.new Inner();
		
	}
	
	public void test() {
		Inner inner = new Inner();
	}
	
	public class Inner {
		
		public void testMethod() {
			myField = "";
		}
		
	}
	
}

class Private {
	
}
