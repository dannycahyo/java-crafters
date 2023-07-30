package objects;

public class Rectangle {
    private double width, length;
    private int sides = 4;

    public Rectangle() {
        setWidth(0);
        setLength(0);
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double calculatePerimeter() {
        return (width + length) * 2;
    }

    public double calculateArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than 0.");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0.");
        }
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        if (sides > 0) {
            this.sides = sides;
        } else {
            System.out.println("Sides must be greater than 0.");
        }
    }
}
