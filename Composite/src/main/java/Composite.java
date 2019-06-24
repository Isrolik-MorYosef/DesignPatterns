import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackeru on 6/24/2019.
 */
public class Composite extends Component {

    List<Component> childern = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public boolean isBinary() {
        if (this.childern.size() == 0 || this.childern.size() %2== 0){
            return true;
        }
        return false;
    }

    @Override
    public void addChild(Component c) {
        childern.add(c);
    }

    @Override
    public void removeChild(Component c) {
        childern.remove(c);
    }

    @Override
    public List<Component> getChilds() {
        return childern;
    }

    @Override
    public void draw(String space) {
        System.out.println(space + this.name);
        for (Component c : childern) {
            c.draw(space + "       ");
        }
    }
}
