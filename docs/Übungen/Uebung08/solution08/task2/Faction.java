package task2;

public class Faction {
	private IRelationship relationship;
	
	public Faction() {
		super();
		relationship = new Neutral(this);
	}

	public IRelationship getRelationship() {
		return relationship;
	}

	public void setRelationship(IRelationship relationship) {
		this.relationship = relationship;
	}

	public void provoke() {
		relationship.provoke();
	}

	public void gift() {
		relationship.gift();
	}

	public void attack() {
		relationship.attack();
	}

	public void chat() {
		relationship.chat();
	}

	public String currentRelationship() {
		return relationship.name();
	}
	
}
