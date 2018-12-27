import java.util.Random;

/**
 * A letter game.
 * The goal is to find words in a map of letters.
 */
public class Game {
	private char[][] board;
	private int width = 4;
	private int height = 4;
	private Random random = new Random();
	
	/**
	 * Gets a random letter. Helper method.
	 * @return a random letter of ABCDEFGHIJKLMNOPQRSTUVWXYZ.
	 */
	private char nextRandomLetter() {
		int letterInAscii = 65 + random.nextInt(26);
		return (char) letterInAscii;
	}
	
	/**
	 * Gets a random vowel. Helper method.
	 * @return a random vowel of AEIOU
	 */
	private char nextRandomVowel() {
		String vowels = "AEIOU";
		int randomIndex = random.nextInt(vowels.length());
		return vowels.charAt(randomIndex);
	}
	
	/**
	 * Implements the rule whether a vowel should been taken.
	 * @return true if a vowel should be taken.
	 * 		   false otherwise
	 */
	private boolean shouldTakeVowel() {
		return random.nextInt(3) == 0;
	}

	/**
	 * Initializes the game by creating the board.
	 * @param width the width of the game board
	 * @param height the height of the game board
	 */
	private void initializeGame(int width, int height) {
		if(width > 0 && height > 0) {
			this.width = width;
			this.height = height;
			this.board = new char[this.height][this.width];
		} else {
			System.out.println("Game couldn't be initialized. Illegal dimensions.");
		}
	}
	
	/**
	 * Completely fills the board with random letters.
	 */
	private void fillBoard() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				board[i][j] = nextRandomLetter();
			}
		}
	}
	
	/**
	 * Completely fills the board with random letters.
	 * Vowels will appear more often than in fillBoard().
	 * This is the solution to the additional task b).
	 */
	private void fillBoardWithMoreVowels() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (shouldTakeVowel()) {
					board[i][j] = nextRandomVowel();
				} else {
					board[i][j] = nextRandomLetter();
				}
			}
		}
	}
	

	/**
	 * Prints the board out on the console.
	 */
	private void drawBoard() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(" " + board[i][j]);
			}
			System.out.println(); // New line at the end of a row.
		}
	}
	
	/**
	 * Play a game. Initializes the game, fills the board and
	 * draws the board.
	 * @param width the width of the board
	 * @param height the height of the board
	 */
	public void play(int width, int height) {
		initializeGame(width, height);
		fillBoardWithMoreVowels();
		drawBoard();
	}

}
