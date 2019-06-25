/**
 * Created by Hackeru on 6/25/2019.
 */
public class TaxVisitorHoliday implements Visitor {
    @Override
    public double visit(Liqer liqer) {
        return liqer.getPrice() * 0.12;
    }

    @Override
    public double visit(Tabasco tabasco) {
        return tabasco.getPrice() * 3;
    }

    @Override
    public double visit(Clothing clothing) {
        return clothing.getPrice() * 0.5;
    }
}
