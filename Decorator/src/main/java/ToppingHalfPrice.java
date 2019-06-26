
public class ToppingHalfPrice extends ToppingDecorator {

	public ToppingHalfPrice(IPizza pizza) {
		super(pizza);
	}

	@Override
	public String getDetails() {
		return this.pizza.getDetails() + " discount 50%";
	}

	@Override
	public double getCost() {
		return this.pizza.getCost() / 2; 
	}

}
