/**
 * Created by Hackeru on 6/25/2019.
 */
public interface Visitor {
    // מחזיק את כל המוצרים שצריכים עליהם חישוב מס
    public double visit(Liqer liqer);
    public double visit(Tabasco tabasco);
    public double visit(Clothing clothing);

}
