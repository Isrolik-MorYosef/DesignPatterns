/**
 * Created by Hackeru on 6/25/2019.
 */
public interface Visitable {
    //כל מוצר שירצה לממש את החישוב מס יצטרך לרשת מVisitable
    public double accept(Visitor visitor);
}
