package task2;

public class StudentTestDriver {

	public static void main(String[] args) {
		Student Anna = new Student("Anna");
		System.out.println(Anna); // The same as Anna.toString()
		System.out.println(Anna.toString('='));
		System.out.println(Anna.toString(3));
		System.out.println(Anna.toString('*', 3));
		System.out.println(Anna.toString(3, '*'));
		
		Student tom = new Student("Tom", "14-123-456");
		System.out.println(tom);
		
		Student alice = new Student("Alice");
		System.out.println(alice);
		
		System.out.println("----------------");
		for (int i = 0; i < 1000; i++) {
			new Student(Integer.toString(i));
		}
		
		Student eva = new Student("Eva");
		System.out.println(eva);
	}

}
