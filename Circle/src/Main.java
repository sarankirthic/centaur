class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ", circumference=" + String.format("%.2f",
                getCircumference()) + ", area=" +  String.format("%.2f", getArea()) + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(2, "blue");
        System.out.println(circle2.toString());

        Circle circle3 = new Circle(3);
        System.out.println(circle3.toString());
    }
}