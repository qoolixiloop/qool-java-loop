package task2;

import java.util.Random;

public class Hostile implements IRelationship {
	private Faction faction;
	private Random random = new Random();
	
	
	public Hostile(Faction faction) {
		super();
		this.faction = faction;
	}

	@Override
	public void provoke() {}

	@Override
	public void gift() {
		if (isGiftSuccessful()) {
			System.out.println("o3 We interpret your concessions as a symbol of good faith, let’s have peace.");
			faction.setRelationship(new Neutral(faction));			
		}
	}

	@Override
	public void attack() {}

	@Override
	public void chat() {
		System.out.println("o7 Grrr!");
	}

	@Override
	public String name() {
		return "HOSTILE";
	}
	
	private boolean isGiftSuccessful() {
		return (random.nextInt(4) == 0);
	}

}
