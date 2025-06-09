class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < this.coeffs.length; i++) {
            result += this.coeffs[i] + "x^" + i;
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial p) {
        if (this.coeffs.length > p.coeffs.length) {
            for (int i = this.coeffs.length - 1; i > 0; i--) {
                this.coeffs[i] = this.coeffs[i] + p.coeffs[i];
            }
        } else {
            for (int i = p.coeffs.length - 1; i > 0; i--) {
                this.coeffs[i] = this.coeffs[i] + p.coeffs[i];
            }
        }
    }
}
