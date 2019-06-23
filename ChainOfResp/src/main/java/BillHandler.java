/**
 * Created by hackeru on 6/23/2019.
 */
public abstract class BillHandler {

    protected BillHandler setNext(BillHandler next) {
        return this.next = next;
    }

    protected BillHandler next;

    public abstract void handle(int amount);

}