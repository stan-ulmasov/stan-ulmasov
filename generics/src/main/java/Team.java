import java.util.ArrayList;

//public class Team {
//add specific parameters that class can accept - generics <T>
//if we need to accept to the team players only from the Player class
//we need to extend the Team class to Player
public class Team<T extends Player> {
    //add team name
    private String name;

    //create ArrayList to place players or team members inside (collection)
    //private ArrayList<Player> members = new ArrayList<>();
    private ArrayList<T> members = new ArrayList<>();

    //create a constructor
    public Team(String name) {
        this.name = name;
    }

    //create a getter method
    public String getName() {
        return name;
    }

    //create a method to check if player is already in the team or not.
    //If player is not on the team, then add(player) to the team
    //public boolean addPlayer(Player player) {
    public boolean addPlayer(T player) {
    if (members.contains(player)) {
        //System.out.println(player.getName() + " is already on this team");
        //we need to cast if we don't specify where is our generic type is coming from
        //System.out.println(((Player)player).getName() + " is already on this team");
        //we have added that <T extends Player>. Therefore, no need to cast since it knows
        // that players are coming from Player class
        System.out.println(player.getName() + " is already on this team");
        return false;
    } else {
        members.add(player);
        //System.out.println(player.getName() + " picked for team " + this.name);
        //System.out.println(((Player)player).getName() + " picked for team " + this.name);
        System.out.println(player.getName() + " picked for team " + this.name);
        return true;
    }

}

    //create a method to count total number of players in the team
    public int numPlayer() {
        //return size of the team
        return this.members.size();
    }
}
