package ch06_2;

import java.util.Random;

import org.apache.commons.codec.binary.BinaryCodec;

import static java.lang.Math.*;

public class Test
{
	
	public static void main(String[] args) {
		
		Math.round(12.9);
		round(12.9);
		double pi = PI;
		
		Random r = new Random();
		Object object = 100;
		new Integer(100).toString(); // "100"
		Private priv = new Private();
		
	}
	
	public String toString() {
		return "Hallo";
	}
	
	public boolean equals(Object other) {
		return this == other;
	}
	
}