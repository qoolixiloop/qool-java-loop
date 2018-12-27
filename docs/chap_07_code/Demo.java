package ch07;

import java.util.Arrays;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		int[][] multi = new int[10][15];
		multi[0][0] = 10;
		
		int[] ints = new int[100];
		Random r = new Random();
		for(int i=0; i < ints.length; i++) {
			ints[i] = r.nextInt(1000);
		}
		
		int firstValue = ints[0];
		
//		Arrays.sort(ints);
		
		sort(ints);
		
		int currentIndex = getIndexOf(ints, firstValue);
		
		System.out.println("First element: "+firstValue);
		for(int value : ints) {
			System.out.println(value);
		}
		System.out.println("Current index: "+currentIndex);
		
	}

	private static int getIndexOf(int[] ints, int value) {
		
		for(int i=0; i<ints.length; i++) {
			
			if(ints[i] == value)
				return i;
		}
		
		return -1;
		
	}

	private static void sort(int[] ints) {
		
		for(int i=0; i<ints.length; i++) {
			
			int smallestRemainingIndex = getSmallestIndex(ints, i);
			
			int tmp = ints[i];
			ints[i] = ints[smallestRemainingIndex];
			ints[smallestRemainingIndex] = tmp;
			
		}
		
	}

	private static int getSmallestIndex(int[] ints, int starting) {
		
		int currentSmallestIndex = starting;
		int currentSmallestValue = ints[starting]; 
		for(int i=starting; i<ints.length; i++) {
			
			if(ints[i] < currentSmallestValue) {
				currentSmallestIndex = i;
				currentSmallestValue = ints[i];
			}
			
		}
		return currentSmallestIndex;
		
	}
	
}	
