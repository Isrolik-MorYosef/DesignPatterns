
public class ProxyATM implements IMonitorService {

	@Override
	public int getTotalCash(String pass) {
		RealATM atm = new RealATM();

		if (pass == "1234") {
			return atm.getTotalCash(pass);
		}
		return 0;
	}

	@Override
	public boolean isWorking() {
		RealATM atm = new RealATM();
		return atm.isWorking();
	}

}
