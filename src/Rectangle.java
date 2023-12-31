public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }

    @Override
    public double pmt() {
        return 2 * (a + b);
    }
}
