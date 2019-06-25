import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hackeru on 6/23/2019.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String amount = "";


        BillHandler billHandler200 = new Bill200();
        BillHandler billHandler100 = new Bill100();
        BillHandler billHandler50 = new Bill50();
        BillHandler billHandler20 = new Bill20();
        BillHandler CoinHandler5 = new Coin5();

        billHandler200.setNext(billHandler100).setNext(billHandler50).setNext(billHandler20).setNext(CoinHandler5).setNext(null);
        System.out.print("Enter amount to withdraw from the ATM: ");
        billHandler200.handle(Integer.parseInt(amount = reader.readLine()));
    }
}