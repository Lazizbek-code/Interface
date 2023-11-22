import static java.lang.Math.*;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return PI * pow(radius, 2);
    }

    @Override
    public double pmt() {
        return 2 * PI * radius;
    }
}
