import java.util.Vector;

/**
 * Manages arbitrary amount of <ITeamMember> objects which get informed if any bonus news are available (they observe this
 * instance). Interested <ITeamMembers> can register themselves to this object. The objects participate a loosely
 * coupled 1:n relationship.
 * 
 */
public class SoccerTeam {

  private String name;
  private Vector<ITeamMembers> listeners = new Vector<ITeamMember>();

  public SoccerTeam(String name) {
    this.name = name;
  }

  /**
   * Adds given listener to the list of observer which get informed for any bonus news available.
   * 
   * @param listener
   *          Observer to add
   */
  public void registerTeamMember(ITeamMember listener) {
    listeners.add(listener);
  }

  /**
   * Removes given listener from observer list.
   * 
   * @param listener
   *          Observer to remove (won't be informed any more)
   */
  public void unregisterTeamMember(ITeamMember listener) {
    listeners.remove(listener);
  }

  /**
   * Informs all registered observers.
   * 
   * @param informations
   *          Bonus News to distribute to all observers
   */
  public void distributeInformation(String beatenTeam, String bonusInformation) {
    for (ITeamMember listener : listeners) {
      listener.receiveInformation(beatenTeam, bonusInformation);
    }
  }
}
