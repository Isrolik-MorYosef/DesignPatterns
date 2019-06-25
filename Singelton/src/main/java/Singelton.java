/**
 * Created by hackeru on 6/23/2019.
 */
public class Singelton {

    private static Singelton INSTANCE;
    private static Object keyThred = new Object();

    private Singelton(){
    }

    public static Singelton getInstance(){
        if (INSTANCE != null){
            return INSTANCE;
        }
        synchronized (keyThred) {
            if (INSTANCE == null) {
                INSTANCE = new Singelton();
            }
        }
        return INSTANCE;
    }

    /**
     * Created by hackeru on 6/23/2019.
     */
    public static class StatePattern {

    }
}
