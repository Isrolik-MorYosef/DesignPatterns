
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
		System.out.println("==================================");
		System.out.println("The Devices Change to: " + device.getName());
		System.out.println("==================================");
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
	public void pressRedButten(){
		this.device.redButten();
	}
	
	public void OpenMyBedroomDoor()
	{
		
	}
	
	public void TurnOnAlarm()
	{
		
	}
}
