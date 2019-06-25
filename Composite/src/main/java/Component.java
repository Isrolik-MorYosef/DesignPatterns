import javax.naming.OperationNotSupportedException;
import java.util.List;

/**
 * Created by hackeru on 6/24/2019.
 */
public abstract class Component {

    protected String name;

    public abstract void addChild(Component c )throws OperationNotSupportedException;
    public abstract void removeChild(Component c)throws OperationNotSupportedException;;
    public abstract List<Component> getChilds();

    public abstract void draw(String s);

    public Component(String name) {
        this.name = name;
    }

    public abstract boolean isBinary();
}
