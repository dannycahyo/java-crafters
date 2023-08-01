package abstraction;

public sealed abstract class Shape permits Rectangle {
    public void print() {
        System.out.println("This is a shape");
    }

    public abstract double getArea();
}
