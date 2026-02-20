public class Triangle extends Shape {
    private double b;
    private double h;
    public Triangle (double base, double altura){
        b = base;
        h = altura;
    }
    public double area (){
        return (b*h)/2;
    }
}

