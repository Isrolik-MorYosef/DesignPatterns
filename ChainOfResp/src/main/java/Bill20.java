/**
 * Created by hackeru on 6/23/2019.
 */
public class Bill20 extends BillHandler {

    @Override
    public void handle(int amount) {
        if (amount >= 20) {
            System.out.println("Giving 20 X " + amount / 20);
        }
        if (amount % 20 > 0) {
            if (next != null) {
                next.handle(amount % 20);
            }
        }
    }
}
