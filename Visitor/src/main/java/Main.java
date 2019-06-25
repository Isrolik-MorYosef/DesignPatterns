/**
 * Created by Hackeru on 6/25/2019.
 */
public class Main {
    public static void main(String[] args) {
        Liqer absulote = new Liqer(60);
        System.out.println(absulote);
        System.out.println(absulote.accept(new TaxVisitorHoliday()));

        Tabasco garlic = new Tabasco(10);
        System.out.println(garlic);
        System.out.println(garlic.accept(new TaxVisitorHoliday()));

        Clothing TShert = new Clothing(100);
        System.out.println(TShert);
        System.out.println(TShert.accept(new TaxVisitorHoliday()));
    }
}
