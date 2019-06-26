
public class BasePizza implements IPizza {

	@Override
	public String getDetails() {
		return "Plain doe and spices";
	}

	@Override
	public double getCost() {
		return 20;
	}

	@Override
	public String toString() {
		return "BasePizza [" + getDetails() + " " + getCost() + "]";
	}

}
