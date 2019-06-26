
public class Main {

	public static void main(String[] args) {

		TV samsungSmartTV = new TV();
		Memir memir = new Memir();
		
		RemoteControl myCoolRemote = new RemoteControl(samsungSmartTV);
		myCoolRemote.pressInfo();
		myCoolRemote.pressOn();
		myCoolRemote.pressedNext();
		myCoolRemote.pressedNext();
		myCoolRemote.pressedPrevious();
		myCoolRemote.pressInfo();
		
		myCoolRemote.setDevice(memir);
		myCoolRemote.pressInfo();
		myCoolRemote.pressOn();
		myCoolRemote.pressedNext();
		myCoolRemote.pressedNext();
		myCoolRemote.pressedPrevious();
		myCoolRemote.pressInfo();
	}
}