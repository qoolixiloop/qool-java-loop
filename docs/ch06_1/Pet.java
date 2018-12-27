package ch06_1;

public class Pet
{
	
    private String name;
    private int age;      //in years
    private double weight;//in pounds
    
    public static void main(String[] args) {
    	
    	Pet pet = new Pet();
    	
    }
    
    public void set(String name, int age, double weight) {
    	// ... 
    }
    
    public void set(String name) {
    	this.name = name;
    }
    
    public void set(int age) {
    	this.age = age;
    }
    
    public void set(double weight) {
    	this.weight = weight;
    }
    
    public void writeOutput( )
    {
        System.out.println("Name:   " + name);
        System.out.println("Age:    " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }
}
