

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Context myContext = new Context();

        myContext.init(new IAmOn());

        myContext.turnOn();
        myContext.turnOn();
        myContext.turnOff();
        myContext.fix();
    }
}
