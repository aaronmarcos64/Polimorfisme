public abstract class Shape implements Comparable <Shape>{
    public abstract double area();
    @Override
    public int compareTo(Shape o) {
        return 0;
    }
}
