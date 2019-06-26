
public class Memir extends EntertainmentDevice {
	private String name;

	public Memir(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	@Override
	public void redButten() {
		System.out.println("The converter enters recording mode");
	}

}
