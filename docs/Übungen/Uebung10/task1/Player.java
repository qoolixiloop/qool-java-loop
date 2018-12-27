/**
 * Represents a player who can participate in a soccer team.
 * 
 */
public class Player implements ITeamMember {

  private String name;

  public Player(String name) {
    this.name = name;
  }

  public void receiveBonusInformation(String beatenTeam, String bonusInformation) {
	  System.out.println("I" + name + " was the key of our victory over team " beatenTeam " and therefore I get" + bonusInformation);
  }
}
