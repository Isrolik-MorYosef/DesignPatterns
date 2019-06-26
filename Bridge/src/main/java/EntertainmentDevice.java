
public abstract class EntertainmentDevice {
	
	protected int state;
	
	protected int maxSetting;
	
	protected boolean isOn;
	
	public abstract void printStatus();
	
	public abstract void nextPressed();
	
	public abstract void previousPressed();
	
	public void turnOn()
	{
		this.isOn = true;
	}

	public void turnOff()
	{
		this.isOn = false;
	}
	
	public void showBattery()
	{
		
	}
	
	public void turnOnRedLight()
	{
		
	}

}
