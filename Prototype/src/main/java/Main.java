/**
 * Created by hackeru on 6/24/2019.
 */
public class Main {
    public static void main(String[] args) {

        Circle myCircle = new Circle(new Point(3.5, 9.4), 55);

        System.out.println(myCircle);

        giveMyYourCircle(myCircle.clone());

        System.out.println(myCircle);
    }


    private static void giveMyYourCircle(Circle c)
    {
        c.getCenter().setX(0.9);
    }
}
