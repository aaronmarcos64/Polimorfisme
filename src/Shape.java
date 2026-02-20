public abstract class Shape implements Comparable <Shape>{
    public abstract double area();
    @Override
    public int compareTo(Shape s) {
        return Double.compare(this.area(), s.area());
    }
}
