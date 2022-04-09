package classes;

public class Trapezoid extends Figure2D {
    public double a;
    public double b;
    public double c;
    public double d;

    public Trapezoid(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    double area() {
        double sl = Math.sqrt(c*c - Math.pow((Math.pow((a-b),2) + c*c - d*d)/(2*(a-b)),2));
        return ((a+b)/2) * sl;
    }

    @Override
    double perimeter() {
        return a + b + c + d;
    }
}
