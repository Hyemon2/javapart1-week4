package Tutorial_week12;


class Complex {
    public double real;
    public double image;

    Complex() {
        real = 0;
        image = 0;
    }

    Complex(double r, double i) {
        real = r;
        image = i;
    }

    public Complex add(Complex c) {
        Complex c0 = new Complex(0, 0);
        c0.real = real + c.real;
        c0.image = image + c.image;
        return c0;
    }

    public Complex multiply(Complex c) {
        Complex c0 = new Complex(0, 0);
        c0.real = real * c.real - image * c.image;
        c0.image = real * c.image + image * c.real;
        return c0;
    }

    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}
