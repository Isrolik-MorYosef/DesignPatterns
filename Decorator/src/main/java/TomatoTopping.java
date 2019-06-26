
public class TomatoTopping extends ToppingDecorator{

	public TomatoTopping(IPizza pizza) {
		super(pizza);
	}

	@Override
	public String getDetails() {
		return this.pizza.getDetails() + " Tomato";
	}

	@Override
	public double getCost() {
		return this.pizza.getCost() + 4;
	}
	
	

}
