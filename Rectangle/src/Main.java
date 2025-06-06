class Rectangle {
    private float length;
    private float width;

    Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ", area=" + String.format("%.2f",getArea()) + ", perimeter=" + String.format("%.2f", getPerimeter()) + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2);

        rectangle1.setLength(5.6f);
        rectangle1.setWidth(7.8f);

        System.out.println(rectangle1);
    }
}
