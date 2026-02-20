public class Rectangle extends Shape {
    private double l1;
    private double l2;

    public Rectangle(double base, double altura){
        l1 = base;
        l2 = altura;
    }
    public double area(){
        return l1*l2;
    }

}
