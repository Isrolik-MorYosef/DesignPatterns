package Exersice;

/**
 * Created by hackeru on 6/24/2019.
 */
public class Main {
    public static void main(String[] args) {

        StrCalculator strCalculator = new StrCalculator();

        //draw(new NotWorkCalculate(), strCalculator);
        draw(new AdapterStr2Int(), strCalculator);
    }
    private static void draw(StrCalc strCalc, StrCalculator strCalculator)
    {
        String res = strCalc.CalculateNotWork(4, 2);
        System.out.println(res);
    }
}
