
public class RemoteControl {

	protected EntertainmentDevice device;

	public RemoteControl(EntertainmentDevice device) {
		super();
		this.device = device;
	}

	public EntertainmentDevice getDevice() {
		return device;
	}

	public void setDevice(EntertainmentDevice device) {
		this.device = device;
	}
	
	public void pressOn()
	{
		this.device.turnOn();
	}
	
	public void pressOff()
	{
		this.device.turnOff();
	}
	
	public void pressedNext()
	{
		this.device.nextPressed();
	}
	
	public void pressedPrevious()
	{
		this.device.previousPressed();
	}	
	
	public void pressInfo()
	{
		this.device.printStatus();
	}
	
	public void OpenMyBedroomDoor()
	{
		
	}
	
	public void TurnOnAlarm()
	{
		
	}
}
