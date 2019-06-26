
public class Main {

	public static void main(String[] args) {

		TV samsungSmartTV = new TV("samsung Smart TV");
		Memir memir = new Memir("memir Yes");
		
		RemoteControl myCoolRemote = new RemoteControl(samsungSmartTV);
		myCoolRemote.pressInfo();
		myCoolRemote.pressOn();
		myCoolRemote.pressedNext();
		myCoolRemote.pressedNext();
		myCoolRemote.pressedPrevious();
		myCoolRemote.pressInfo();
		myCoolRemote.pressRedButten();
		
		myCoolRemote.setDevice(memir);
		myCoolRemote.pressInfo();
		myCoolRemote.pressOn();
		myCoolRemote.pressedNext();
		myCoolRemote.pressedNext();
		myCoolRemote.pressedPrevious();
		myCoolRemote.pressInfo();
		myCoolRemote.pressRedButten();
		myCoolRemote.setDevice(samsungSmartTV);

	}
}