/**
 * Created by hackeru on 6/24/2019.
 */
public class Main {

    public static void main(String[] args) {

        Dog rex = new Dog("Rexi", 1.2f);

        rex.setFlyOption(new SuccssesFly());

        rex.tryToFly();

        rex.setFlyOption(new CannotFly());

        rex.tryToFly();

        Bird twitty = new Bird("Twitty", 0.3f);

        twitty.setFlyOption(new SuccssesFly());

        twitty.tryToFly();
    }

}
