class MyRectangle {
    private MyPoint a, b, c, d;

    MyRectangle(int a1, int a2, int b1, int b2, int c1, int c2, int d1, int d2) {
        a = new MyPoint(a1, a2);
        b = new MyPoint(b1, b2);
        c = new MyPoint(c1, c2);
        d = new MyPoint(d1, d2);
    }
    MyRectangle(MyPoint a, MyPoint b, MyPoint c,  MyPoint d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String toString() {
        return "Triangle[a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
    }

    public double getPerimeter() {
        return a.distance(b) + c.distance(d);
    }

    public double getArea() {
        return a.distance(b) * c.distance(d);
    }
}
