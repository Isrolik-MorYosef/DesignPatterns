
public class Main {

	public static void main(String[] args) {

		SaladBuilder tuna = new TunaSaladBuilder();
		
		tuna.buildSalad();
		
		Salad mySalad = tuna.getSalad();
	}

}
