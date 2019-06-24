/**
 * Created by hackeru on 6/24/2019.
 */
public class Circle implements Prototype<Circle> {
    private Point center;
    double area;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", area=" + area +
                '}';
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Circle(Point center, double area) {
        this.center = center;
        this.area = area;
    }

    @Override
    public Circle clone() {
        return new Circle(center.clone(),this.area);
    }
}
