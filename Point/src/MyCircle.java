class MyCircle {
    private MyPoint center;
    private int radius;

    MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int centerX) {
        this.center.setX(centerX);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int centerY) {
        this.center.setY(centerY);
    }

    public int[] getCenterXY() {
        return new int[]{getCenterX(), getCenterY()};
    }

    public void setCenterXY(int[] centerXY) {
        this.center.setX(centerXY[0]);
        this.center.setY(centerXY[1]);
    }

    public String toString() {
        return "MyCircle[" +"radius=" + radius +  ",center=" + center + "]";
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public double distance(MyCircle circle) {
        return Math.sqrt(Math.pow(this.center.getX() - circle.center.getX(), 2) + Math.pow(this.center.getY() - circle.center.getY(), 2));
    }
}
