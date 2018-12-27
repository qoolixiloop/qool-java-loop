package task2;

public class Neutral implements IRelationship {
	private Faction faction;
	private int provocationCount;

	
	public Neutral(Faction faction) {
		super();
		this.faction = faction;
		this.provocationCount = 0;
	}

	@Override
	public void provoke() {
		provocationCount++;
		if (provocationCount > 2) {
			System.out.println("o10 That was enough!");
			faction.setRelationship(new Hostile(faction));
		} else {
			System.out.println("o9 Stop now.");
		}
	}

	@Override
	public void gift() {
		System.out.println("o4 We are very pleased by your generosity, let’s become allied.");
		faction.setRelationship(new Friendly(faction));
	}

	@Override
	public void attack() {
		System.out.println("o2 Your neutrality was fairly suspicious, we are prepared!");
		faction.setRelationship(new Hostile(faction));
	}

	@Override
	public void chat() {
		System.out.println("o8 Go on. What do you have to say?");
	}

	@Override
	public String name() {
		return "NEUTRAL";
	}

}
