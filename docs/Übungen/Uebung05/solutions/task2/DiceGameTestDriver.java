public class DiceGameTestDriver {

	public static void main(String[] args) {
		DiceGame diceGame = new DiceGame();
		diceGame.play();
		diceGame.printSummary();
		System.out.println();
		
		diceGame.play();
		diceGame.printSummary();
	}

}
