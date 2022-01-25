/*
  we make this class as an abstract since there will be some classes
  which will extend this class and we can create an object of those
  classes. However, we are not going to create an object of this class.
 */

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
