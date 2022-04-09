package classes;

public class Rectangular extends Figure2D {
    public double a;
    public double b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double area(){
        return a*b;
    }


    double perimeter() {
        return 2*(a+b);
    }


}
