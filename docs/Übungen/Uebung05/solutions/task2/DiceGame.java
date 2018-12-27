import java.util.Random;

public class DiceGame {
	private int[] rolls = new int[30];
	private int numberOfRolls = 0;
	private Random random = new Random();

	public int getNumberOfRolls() {
		return this.numberOfRolls;
	}
	
	public void play() {
		numberOfRolls = 0;
		int sumPoints = 0; 
		while (sumPoints < 30) {
			int result = rollDice();
			rolls[numberOfRolls++] = result;
			sumPoints += result;
		}
	}
	
	private int rollDice() {
		return random.nextInt(6) + 1;
	}

	public void printSummary() {
		int sumPoints = 0;
		for (int i = 0; i < numberOfRolls; i++) {
			sumPoints += rolls[i];
			System.out.println("[" + (i+1) + "] = " + rolls[i] + "  (" + sumPoints + ")");
		}
		System.out.println("Won after " + numberOfRolls + " dice rolls.");
	}

}
