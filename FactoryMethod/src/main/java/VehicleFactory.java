import java.util.Date;

public class VehicleFactory {

	public Vehicle CreateVehicle(String s)
	{
		if (s.toUpperCase().startsWith("C"))
		{
			return new Car("Honda", 2020);
		}
		
		if (s.toUpperCase().startsWith("F")){
			return new Plane("F-15", 2018, 4);
		}
		return null;
	}

}
