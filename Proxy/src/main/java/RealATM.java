
public class RealATM implements IAtm , IMonitorService {

	private int totalMoney = 1000000;
	
	@Override
	public void desposit(int amount) {
		System.out.println("Getting " + amount);
		
	}

	@Override
	public boolean withdraw(int amount) {
		System.out.println("withdraw " + amount);
		return amount < totalMoney;
	}

	@Override
	public void insertCard() {
		System.out.println("Inserting card");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("ejecting card");
		
	}

	@Override
	public String getAddres() {
		return  "ramat-gan 3";
	}

	@Override
	public int getTotalCash(String password) {
		RealATM atm = new RealATM();

		if (password.equals("1234")) {
			return totalMoney;		}
		return 0;
	}

	@Override
	public boolean isWorking() {
		return totalMoney > 0;
	}

	
	
	
}
