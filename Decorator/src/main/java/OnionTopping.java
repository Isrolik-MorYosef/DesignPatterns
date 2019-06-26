/**
 * Created by hackeru on 6/26/2019.
 */
public class OnionTopping extends ToppingDecorator {
    public OnionTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDetails() {
        return this.pizza.getDetails() + " Onion";
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 2;
    }
}
