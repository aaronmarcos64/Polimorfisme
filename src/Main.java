public class Main {
    public static void main(String[] args) {
    Shape[] v = new Shape[4];

    v[0] = new Rectangle(5, 3);
    v[1] = new Triangle(5,5);
    v[2] = new Square(5);
    v[3] = new Circle(120);

    double res = suma(v);

    System.out.println("sum: " + res);

    print(v);

    sort(v);

    print(v);
}

    private static double suma(Shape[] v) {

    }
}
