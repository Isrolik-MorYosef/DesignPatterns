
public abstract class ToppingDecorator implements IPizza {

	protected IPizza pizza;

	public ToppingDecorator(IPizza pizza) {
		super();
		this.pizza = pizza;
	}
		
}
