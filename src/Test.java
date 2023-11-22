public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(4, 5);

        System.out.println("circle.square() = " + circle.square());
        System.out.println("rectangle.square() = " + rectangle.square());

        System.out.println("circle.pmt() = " + circle.pmt());
        System.out.println("rectangle.pmt() = " + rectangle.pmt());
    }
}
