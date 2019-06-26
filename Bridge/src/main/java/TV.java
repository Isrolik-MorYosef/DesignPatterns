public class TV extends EntertainmentDevice {

	@Override
	public void printStatus() {
		System.out.println("TV status is " + (isOn ? "On" : "Off") + " Channel : " + this.state);
		
	}

	@Override
	public void nextPressed() {
		state++;
		System.out.println("Increasing TV channel to " + state);
	}

	@Override
	public void previousPressed() {
		state--;
		System.out.println("Decreasing TV channel to " + state);
	}

}
