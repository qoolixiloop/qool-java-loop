package ch04;


public class ForDemo
{
	
	public static void main(String[] args)
    {
    	for(Suites s : Suites.values()) {
    		System.out.println(s);
    	}
    }
}

enum Suites {
	DIAMOND, HEART, CLUBS, SPADES
}