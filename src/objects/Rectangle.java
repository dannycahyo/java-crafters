package objects;

public class Rectangle {
    private double width, length;
    private int sides = 4;

    public double calculatePerimeter(double width, double length) {
        return (width + length) * 2;
    }

    public double calculateArea(double width, double length) {
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

    public double getHeight() {
        return length;
    }

    public void setHeight(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Height must be greater than 0.");
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
