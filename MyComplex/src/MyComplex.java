class MyComplex {
    private double real;
    private double imag;

    MyComplex() {
        this.real = 0;
        this.imag = 0;
    }

    MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public String toString() {
        return real + "," + imag + "i";
    }

    public boolean isReal() {
        return imag == 0 && real != 0;
    }

    public boolean isImag() {
        return imag != 0 && real == 0;
    }

    public boolean equals(double real,  double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex complex) {
        return this.real == complex.real && this.imag == complex.imag;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public MyComplex addInto(MyComplex complex) {
        this.real += complex.real;
        this.imag += complex.imag;
        return this;
    }

    public MyComplex addNew(MyComplex complex) {
        return new MyComplex(this.real + complex.real, this.imag + complex.imag);
    }

    public MyComplex subtract(MyComplex complex) {
        this.real -= complex.real;
        this.imag -= complex.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex complex) {
        return new MyComplex(this.real - complex.real, this.imag - complex.imag);
    }

    public MyComplex multiply(MyComplex complex) {
        this.real *= complex.real;
        this.imag *= complex.imag;
        return this;
    }

    public MyComplex multiplyNew(MyComplex complex) {
        return new MyComplex(this.real * complex.real, this.imag * complex.imag);
    }

    public MyComplex divide(MyComplex complex) {
        return new MyComplex((this.real * complex.getReal() + this.imag * complex.getImag())/(Math.pow(complex.getReal(), 2) + Math.pow(complex.getImag(), 2)),
                (this.imag * complex.getReal() - this.real * complex.getImag())/(Math.pow(complex.getReal(), 2) + Math.pow(complex.getImag(), 2)));
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}
