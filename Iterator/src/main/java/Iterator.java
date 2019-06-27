/**
 * Created by hackeru on 6/27/2019.
 */
public interface Iterator<T> {

    public boolean hasNext();

    public T next();

    public void reset();

    public boolean remove();
}
