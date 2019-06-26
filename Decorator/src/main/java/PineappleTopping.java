
public class PineappleTopping extends ToppingDecorator {

	public PineappleTopping(IPizza pizza) {
		super(pizza);
	}

	@Override
	public String getDetails() {
		return this.pizza.getDetails() + " Pineapple";
	}

	@Override
	public double getCost() {
		return this.pizza.getCost() + 7;
	}

}
