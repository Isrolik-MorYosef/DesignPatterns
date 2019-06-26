
public abstract class EntertainmentDevice {

	private String name;

	protected String getName(){
		return this.name;
	};
	
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

	public abstract void redButten();
	
	public void showBattery()
	{
		
	}
	
	public void turnOnRedLight()
	{
		
	}

}
