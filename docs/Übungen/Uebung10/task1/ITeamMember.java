/**
 * A class can implement this interface when it wants to be informed of bonus information in <SoccerTeam> objects.
 * 
 */
public interface ITeamMember {

  /**
   * This method is called whenever the observed object has bonus news to distribute.
   * 
   * @param beatenTeam
   *          Name of the <SoccerTeam> that has been beaten
   * @param bonusInformations
   *          News
   */
  public void receiveBonusInformation(String beatenTeam, String bonusInformations);
}
