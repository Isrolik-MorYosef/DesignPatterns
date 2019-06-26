
public class Main {

	public static void main(String[] args) {

		IPizza basePizza = new BasePizza();
		System.out.println(basePizza);
	
		IPizza pizzaWithTomatto = new TomatoTopping(basePizza);
		System.out.println(pizzaWithTomatto.getDetails() + " " + pizzaWithTomatto.getCost());
		
		IPizza hawaiienPizza = new PineappleTopping(new TomatoTopping(new OnionTopping(new BasePizza())));
		System.out.println(hawaiienPizza.getDetails() + " " + hawaiienPizza.getCost());
		
		IPizza discount = new ToppingHalfPrice(hawaiienPizza);
		System.out.println(discount.getDetails() + " " + discount.getCost());
		
	}

}
