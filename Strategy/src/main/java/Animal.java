/**
 * Created by hackeru on 6/24/2019.
 */
public abstract class Animal {
    protected String name;
    protected float Highet;

    public Animal(String name, float highet) {
        this.name = name;
        Highet = highet;
    }

    protected myFlyingAbility myFlyingAbility = null;

    protected void setFlyOption(myFlyingAbility ifly){
        this.myFlyingAbility = ifly;
    }

    @Override
    public String toString(){
     return "Animal [name: "+ this.name + " higet: " + this.Highet + "]";
    }

    public void tryToFly()
    {
        this.myFlyingAbility.fly();
    }
}
