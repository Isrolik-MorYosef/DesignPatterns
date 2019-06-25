/**
 * Created by Hackeru on 6/25/2019.
 */
public class TaxVisitorSummer implements Visitor {
    @Override
    public double visit(Liqer liqer) {
        return liqer.getPrice() * 0.12;
    }

    @Override
    public double visit(Tabasco tabasco) {
        return 0;
    }

    @Override
    public double visit(Clothing clothing) {
        return 0;
    }
}
