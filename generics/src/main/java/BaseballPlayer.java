public class BaseballPlayer extends Player {
    /*
    Since we have created a constructor in the Player class we need to call that constructor.
    If we don't call the constructor, then Java will try to find default constructor.
    Since, it will not be able to find it, we would see following error message:
    There is no default constructor available in 'Player'
     */
    public BaseballPlayer(String name) {
        super(name);
    }
}
