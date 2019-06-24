import javax.naming.OperationNotSupportedException;
import java.util.List;

/**
 * Created by hackeru on 6/24/2019.
 */
public class Leaf  extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public void addChild(Component c) throws OperationNotSupportedException {

    }

    @Override
    public void removeChild(Component c) throws OperationNotSupportedException {

    }

    @Override
    public List<Component> getChilds() {
        return null;
    }

    @Override
    public void draw(String space) {
        System.out.println(space + this.name);
    }
}
