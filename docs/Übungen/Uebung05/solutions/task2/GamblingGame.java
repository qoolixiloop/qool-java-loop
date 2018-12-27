public class GamblingGame {
	private int costsPerRoll = 0;
	private int bonusOnSuccess = 0;
	private int maxRollsForSuccess = 0;
	
	public void simulate(int numberOfGames) {
		long profit = 0;
		DiceGame diceGame = new DiceGame();
		for (int i = 0; i < numberOfGames; i++) {
			diceGame.play();
			int rolls = diceGame.getNumberOfRolls(); 
			profit += bonus(rolls) - cost(rolls);	
		}
		double averageProfit = (double) profit / numberOfGames;
		System.out.println("Your average profit is " + averageProfit);
	}

	public void setCostsPerRoll(int costsPerRoll) {
		this.costsPerRoll = costsPerRoll;
	}

	public void setBonusOnSuccess(int bonusOnSuccess) {
		this.bonusOnSuccess = bonusOnSuccess;
	}

	public void setMaxRollsForSuccess(int maxRollsForSuccess) {
		this.maxRollsForSuccess = maxRollsForSuccess;
	}

	private int bonus(int numberOfRolls) {
		int bonus = 0;
		if (numberOfRolls <= maxRollsForSuccess) {
			bonus += bonusOnSuccess;
		}
		return bonus;
	}
	
	private int cost(int numberOfRolls) {
		return numberOfRolls * costsPerRoll;
	}

}
