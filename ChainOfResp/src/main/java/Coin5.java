/**
 * Created by hackeru on 6/23/2019.
 */
public class Coin5 extends BillHandler {

    @Override
    public void handle(int amount) {
        if (amount >= 5) {
            System.out.println("Giving 5 coins X " + amount / 5);
        }
        if (amount % 5 > 0) {
            if (next != null) {
                next.handle(amount % 5);
            }
        }
    }
}
