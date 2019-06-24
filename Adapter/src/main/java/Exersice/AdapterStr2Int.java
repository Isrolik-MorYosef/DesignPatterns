package Exersice;

/**
 * Created by hackeru on 6/24/2019.
 */
public class AdapterStr2Int implements StrCalc {

    IntCalc adapter = new WorkCalculate();

    public String CalculateNotWork(int a, int b) {
       return adapter.Calculate(a, b);
    }
}
