/**
 * Created by Hackeru on 6/25/2019.
 */
public class Clothing implements Visitable{

    private double price;

    public Clothing(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "price=" + price +
                '}';
    }
}
