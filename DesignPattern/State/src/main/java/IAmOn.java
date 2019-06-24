
/**
 * Created by hackeru on 6/23/2019.
 */
public class IAmOn extends LightState{

    @Override
    public LightState turnOn() {
        System.out.println("I am already on....broke");
        return new IAmBroker().turnOn();
    }

    @Override
    public LightState turnOff() {
        System.out.println("Turning off....");
        return new IAmOff();
    }

    @Override
    public LightState fix() {
        return new IAmBroker();
    }

}
