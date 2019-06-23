
public class Main {

	public static void main(String[] args) {

		// add scanner input from user
		String userInput = "Car";
		String f15 = "F-15;";

		Vehicle v = new VehicleFactory().CreateVehicle(userInput);
		Vehicle f = new VehicleFactory().CreateVehicle(f15);
		System.out.println(v);


		

	}

}
