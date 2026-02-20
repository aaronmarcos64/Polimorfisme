public abstract class Shape implements Comparable <Shape>{
    public abstract double area();
    @Override
    public int compareTo(Shape s) {
        return this.area() - s.area();
    }
}
