import java.util.ArrayList;
import java.util.List;

public class Salad {

	
	private List<String> ingredients = new ArrayList<String>();

	public Salad() {
		
		// prepareVegg
		// prepareMain
		// prepareGraving
		// preparePrice		
	}
	
	public void prepareVegg(String vegg)
	{
		ingredients.add(vegg);
	}
	
	public void prepareMain(String main)
	{
		ingredients.add(main);
	}
	
	public void prepareGraving(String graving)
	{
		ingredients.add(graving);
	}
	
	public void preparePrice(String price)
	{
		ingredients.add(price);
	}	
	
	
	
}
