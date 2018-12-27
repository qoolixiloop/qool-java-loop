package task2;

public class FactionRelationshipCLITestDriver {

	public static void main(String[] args) {
		Faction myFaction = new Faction();
		FactionRelationshipCLI cli = new FactionRelationshipCLI(myFaction);
		cli.run();
	}

}
