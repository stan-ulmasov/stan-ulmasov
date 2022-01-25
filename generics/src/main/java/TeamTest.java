public class TeamTest {
    public static void main (String[] args){
        //create real players or team members
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");

        //create a team
        // Team liverpool = new Team("Liverpool");

         Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

         //Team<String> brokenTeam = new Team<>("This will not work");
         //add players to the Liverpool team
        liverpool.addPlayer(beckham);
//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);

        //print out total number of players in the Liverpool team
        System.out.println(liverpool.numPlayer());

    }
}
