public class TV extends EntertainmentDevice {

	private String name;

	public TV(String name) {
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

	@Override
	public void redButten() {
		System.out.println("The TV went into mute mode");
	}

}
