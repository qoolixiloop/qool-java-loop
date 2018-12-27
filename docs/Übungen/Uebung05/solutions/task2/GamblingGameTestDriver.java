public class GamblingGameTestDriver {

	public static void main(String[] args) {	
		GamblingGame gamblingGame = new GamblingGame();
		gamblingGame.setCostsPerRoll(2);
		gamblingGame.setBonusOnSuccess(1000);
		gamblingGame.setMaxRollsForSuccess(6);
		
		gamblingGame.simulate(1);
		gamblingGame.simulate(100);
		gamblingGame.simulate(1000);
		gamblingGame.simulate(10000);
		gamblingGame.simulate(100000);
		gamblingGame.simulate(1000000);
		gamblingGame.simulate(10000000);
	}

}
