/**
 * Created by hackeru on 6/23/2019.
 */
public class Bill50 extends BillHandler {

    @Override
    public void handle(int amount) {
        if (amount >= 50) {
            System.out.println("Giving 50 X " + amount / 50);
        }
        if (amount % 50 > 0) {
            if (next != null) {
                next.handle(amount % 50);
            }
        }
    }
}
