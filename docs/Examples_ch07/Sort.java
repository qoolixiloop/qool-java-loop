package ch07;

import java.util.Arrays;
import java.util.Random;

public class Sort {

	private static final int NR_OF_VALUES = 10;
	private static final int MAX_VALUE = 100;
	
	public static void main(String[] args) {
		
		int[] randomInts = new int[NR_OF_VALUES];
		Random r = new Random();
		
		for(int i = 0; i<randomInts.length; i++)
			randomInts[i] = r.nextInt(MAX_VALUE);
		
		System.out.println("Original Array:");
		printArray(randomInts);
		
		int firstVal = randomInts[0];
		System.out.println("First value: "+firstVal);
		System.out.println("---------------");
		
		// Arrays.sort(randomInts);
		sort(randomInts);
		System.out.println("Sorted Array:");
		printArray(randomInts);
		
		int idx = findIndexOfElement(firstVal, randomInts);
		if(idx == -1)
			System.out.println("Not found :(");
		else
			System.out.println("Value "+firstVal+" has been moved to index "+idx);
		
	}
	
	private static void printArray(int[] array) {
		for(int val : array)
			System.out.println(val);
		System.out.println("---------------");
	}
	
	private static void sort(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			
			int lowestVal = array[i];
			int lowestIndex = i;
			
			for(int j=i; j<array.length; j++) {
				
				if(array[j] < lowestVal) {
					lowestVal = array[j];
					lowestIndex = j;
				}
				
			}
			
			if(lowestIndex != i) {
				
				int tmp = array[i];
				array[i] = array[lowestIndex];
				array[lowestIndex] = tmp;
				
			}
			
		}
		
	}
	
	private static int findIndexOfElement(int val, int[] array) {
			
		for(int i = 0; i<array.length; i++)
			if(array[i] == val)
				return i;
		
		return -1;
		
	}

}
