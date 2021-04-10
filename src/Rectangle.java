public class Rectangle {
    private double length, width;

    public Rectangle(double width, double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}
