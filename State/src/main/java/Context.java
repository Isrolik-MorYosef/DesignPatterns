
/**
 * Created by hackeru on 6/23/2019.
 */

public class Context {

    LightState lightState = null;

    public void init(LightState lightState )
    {
        this.lightState = lightState;
    }

    public void turnOn()
    {
        this.lightState = this.lightState.turnOn();
    }

    public void turnOff()
    {
        this.lightState = this.lightState.turnOff();
    }

    public void fix()
    {
        this.lightState = this.lightState.fix();
    }

}
