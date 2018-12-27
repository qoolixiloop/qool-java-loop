/**
 * Represents a coach who can participate in a soccer team.
 * 
 */
public class Coach implements ITeamMember {

  private String name;

  public Coach(String name) {
    this.name = name;
  }

  public void receiveBonusInformation(String beatenTeam, String bonusInformation) {
    System.out.println("My team beat the team " + beatenTeam + " because of my clever strategy and therefore I get " + bonusInformation);
  }
}
