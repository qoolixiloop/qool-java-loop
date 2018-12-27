package task2;

import java.util.Scanner;

public class FactionRelationshipCLI {
	private Faction faction;

	public FactionRelationshipCLI(Faction faction) {
		super();
		this.faction = faction;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean shouldContinue = true;
		while (shouldContinue && sc.hasNextLine()) {
			String input = sc.nextLine();
			for (char ch : input.toCharArray()) {
				shouldContinue = handleCharInput(ch);
			}
		}
		sc.close();
		System.out.println("Goodbye!");
	}

	/**
	 * Parses the provided character and executes the appropriate action.
	 * 
	 * @param ch character to be handled.
	 * @return false if the application should quit and true otherwise.
	 */
	private boolean handleCharInput(char ch) {
		switch (ch) {
		case 'q':
			return false;
		case 'a':
			faction.attack();
			break;
		case 'c':
			faction.chat();
			break;
		case 'g':
			faction.gift();
			break;
		case 'p':
			faction.provoke();
			break;

		default:
			// Ignore invalid characters.
			return true;
		}
		System.out.println(faction.currentRelationship());
		return true;
	}

}
