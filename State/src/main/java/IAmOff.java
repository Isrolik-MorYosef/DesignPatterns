
/**
 * Created by hackeru on 6/23/2019.
 */
public class IAmOff extends LightState {

    @Override
    public LightState turnOn() {
        System.out.println("Turning on....");
        return new IAmOn();
    }

    @Override
    public LightState turnOff() {
        System.out.println("I Alrady off.... broke");
        return new IAmOff();
    }

    @Override
    public LightState fix() {
        return new IAmBroker();
    }

}