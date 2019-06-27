import java.util.*;

/**
 * Created by hackeru on 6/27/2019.
 */
public class MySpecisalStorage implements Iterator<Data> {

    List<Data> data = new ArrayList<Data>();

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Data next() {
        return null;
    }

    @Override
    public void reset() {

    }

    @Override
    public boolean remove() {
        return false;
    }
}
