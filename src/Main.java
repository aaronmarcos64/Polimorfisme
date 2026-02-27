public class Main {
    public static void main(String[] args) {
        Shape[] v = new Shape[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Triangle(5, 5);
        v[2] = new Square(5);
        v[3] = new Circle(120);

        double res = suma(v);

        System.out.println("sum: " + res);

        print(v);

        sort(v);

        print(v);
    }

    private static void sort(Shape[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j].area() > v[j + 1].area()) {
                    Shape temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }

    }
    private static void print (Shape[]v){
    }

    private static double suma (Shape[]v){
    }
}