
public class MozzarellaTopping extends ToppingDecorator {

	public MozzarellaTopping(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDetails() {
		return this.pizza.getDetails() + " Mozarrella";
	}

	@Override
	public double getCost() {
		return this.pizza.getCost() + 5;
	}

}
