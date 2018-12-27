package ch02;

public class EggBasket
{
	
    public static void main(String[] args)
    {
    	
    	
    	int eggsPerBasket = 6;
    	
    	int numberOfBaskets = 3;
    	int totalEggs = eggsPerBasket * numberOfBaskets;
    	
        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);
    }
}