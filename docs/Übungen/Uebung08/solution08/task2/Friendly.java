package task2;

public class Friendly implements IRelationship {
	private Faction faction;
	
	
	public Friendly(Faction faction) {
		super();
		this.faction = faction;
	}

	@Override
	public void provoke() {
		System.out.println("o5 This provocation is intolerable, our alliance is broken.");
		faction.setRelationship(new Neutral(faction));
	}

	@Override
	public void gift() {}

	@Override
	public void attack() {
		System.out.println("o1 An act of treasure from out best friends!");
		faction.setRelationship(new Hostile(faction));
	}

	@Override
	public void chat() {
		System.out.println("o6 Welcome, we are always pleased to meet you.");
	}

	@Override
	public String name() {
		return "FRIENDLY";
	}
	
}
