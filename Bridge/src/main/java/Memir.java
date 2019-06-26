
public class Memir extends EntertainmentDevice {

	@Override
	public void printStatus() {
		System.out.println("Memir (Yes/Hot) status is " + (isOn ? "On" : "Off") + " program : " + this.state);
		
	}

	@Override
	public void nextPressed() {
		state++;
		System.out.println("Increasing Memir program to " + state);
	}

	@Override
	public void previousPressed() {
		state--;
		System.out.println("Decreasing Memir program to " + state);
	}

}
