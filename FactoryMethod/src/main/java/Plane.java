/**
 * Created by hackeru on 6/23/2019.
 */
public class Plane extends Vehicle {

    private int year;
    private int numberOfMotors;

    public Plane(String model, int year, int numberOfMotors) {
        super(model);
        this.year = year;
        this.numberOfMotors = numberOfMotors;
    }

    @Override
    public String toString() {
        return super.toString() +  " Plane [year=" + year + "] + [numberOfMotors= " + numberOfMotors + "]";
    }

}

