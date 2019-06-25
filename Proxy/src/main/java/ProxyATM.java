
public class ProxyATM implements IMonitorService {

	@Override
	public int getTotalCash() {
		RealATM atm = new RealATM();
		return atm.getTotalCash();
	}

	@Override
	public boolean isWorking() {
		RealATM atm = new RealATM();
		return atm.isWorking();
	}

}
