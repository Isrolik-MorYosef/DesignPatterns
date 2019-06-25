package Excexercise;
import java.util.List;

/**
 * Created by hackeru on 6/23/2019.
 */
public class DBsingelton {
    private static List<ConnectionToDB> connectionToDBS;
    private static Object key;
    private DBsingelton INSTANCE;

    public DBsingelton getInstance() {
        if (INSTANCE != null){
            return INSTANCE;
        }
        synchronized (key) {
            if (INSTANCE == null) {
                INSTANCE = new DBsingelton();
            }
        }
        return INSTANCE;
    }

    private void add(){
        connectionToDBS.add(new ConnectionToDB());
    }

    public void remove(int index){
        connectionToDBS.remove(index);
    }

    public ConnectionToDB get(){
        return connectionToDBS.get(0);
    }
}
