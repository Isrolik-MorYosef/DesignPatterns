/**
 * Created by hackeru on 6/23/2019.
 */
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BillHandler billHandler200 = new Bill200();
        BillHandler billHandler100 = new Bill100();
        BillHandler billHandler50 = new Bill50();
        BillHandler billHandler20 = new Bill20();

        billHandler200.setNext(billHandler100).setNext(billHandler50).setNext(billHandler20).setNext(null);
        billHandler200.handle(1950);
    }
}