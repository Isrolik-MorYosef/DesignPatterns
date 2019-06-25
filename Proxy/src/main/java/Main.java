import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		String pass = "";

		RealATM atm = new RealATM();
		System.out.println("insert pin: ");
		System.out.println(atm.getTotalCash(pass = reader.readLine()));
		System.out.println(atm.withdraw(1000));
		System.out.println(atm.getAddres());
		atm.insertCard();
		
		ProxyATM proxy = new ProxyATM();
		System.out.println(proxy.isWorking());

	}

}
