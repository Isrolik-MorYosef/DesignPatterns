import javax.naming.OperationNotSupportedException;

/**
 * Created by hackeru on 6/24/2019.
 */
public class Main {
    public static void main(String[] args) throws OperationNotSupportedException {
        Component root = new Composite("CANVAS root");
        Component circleRoot = new Leaf("circle1");
        Component merubaRoot = new Leaf("meruba1");

        Component container1 = new Composite("container1");
        Component meshusheq1 = new Leaf("meshushe2");
        Component angleq1 = new Leaf("angle");Component meshushe1 = new Leaf("meshushe2");
        Component angle1 = new Leaf("angle");

        Component container2 = new Composite("container2");

        Component container3 = new Composite("container3");
        Component container4 = new Composite("container4");
        Component circle4 = new Leaf("circle");


        root.addChild(circleRoot);
        root.addChild(merubaRoot);
        root.addChild(container1);
        container1.addChild(meshushe1);
        container1.addChild(angle1);
        container1.addChild(meshusheq1);
        container1.addChild(angleq1);
        root.addChild(container2);
        root.addChild(container3);
        container3.addChild(container4);
        container4.addChild(circle4);

        root.draw("");
        System.out.println("-----isBinary?------");
        isBinary(container4);


    }

    // Recorcivy
    private static boolean isBinary(Component c){
        if(!c.isBinary()){
            System.out.println("is not binary");
            return false;
        } if(c.getChilds() != null && c.getChilds().size() == 2) {
           return isBinary(c.getChilds().get(0)) && isBinary(c.getChilds().get(0));
        }
        System.out.println("is binary");
        return true;

    }
}
