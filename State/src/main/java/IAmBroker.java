

/**
 * Created by hackeru on 6/23/2019.
 */
public class IAmBroker extends LightState{

    @Override
    public LightState turnOn() {
        System.out.println("turn on Broke");
        return new IAmBroker();
    }

    @Override
    public LightState turnOff() {
        System.out.println("turn off Broke");
        return new IAmBroker();
    }

    @Override
    public LightState fix() {
        System.out.println("fixed return off");
        return new IAmOff().turnOff();
    }
}
