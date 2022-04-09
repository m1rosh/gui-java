package classes;

public class Circle extends Figure2D {
    public double r;

    public Circle(double r){
        this.r = r;
    }

    public double area(){
        return Math.PI*r*r;
    }


    double perimeter() {
        return 2*Math.PI*r;
    }


}
