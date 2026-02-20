public class Circle extends Shape{
    private double r;
    public Circle(double radio){
        r = radio;
    }
    public double area (){
        return pi*r*r;
    }
}