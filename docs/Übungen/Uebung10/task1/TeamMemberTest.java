public class TeamMemberTest {

  public static void main(String[] args) {
    SoccerTeam st1 = new SoccerTeam("Barcelona");
    SoccerTeam st2 = new SoccerTeam("Real Madrid");

    Coach c1 = new Coach("Christian");
    Coach c2 = new Coach("Marcel");

    Player p1 = new Player("Lionel");
    Player p2 = new Player("Christiano");
    Player p3 = new Player("Karim");
    Player p4 = new Player("Pepe");

    st1.registerTeamMember(c1);
    st2.registerTeamMember(c2);
    st1.registerTeamMember(p1);
    st1.registerTeamMember(p3);
    st2.registerTeamMember(p2);
    st2.registerTeamMember(p4);

    st1.distributeInformation("Valencia FC", "10000 Euro of Bonus");
    st2.distributeInformation("Bayern München", "100000 Euro of Bonus");

    st1.unregisterTeamMember(p1);
    st2.unregisterTeamMember(c2);

    st1.distributeInformation("FC Zürich", "500 Euro of Bonus");
    st2.distributeInformation("PSG", "500000 Euro of Bonus");
  }
}
