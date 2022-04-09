package classes;

public class Triangle extends Figure2D {
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }

    @Override
    double perimeter() {
        return a+b+c;
    }
}
