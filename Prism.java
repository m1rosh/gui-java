package classes;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    public double volume(){
        return base.area()*h;
    }

     public double surfaceArea(){
        if (base instanceof Circle){
            return 2*Math.PI*((Circle) base).r*(((Circle) base).r + h);
        }
        else {
            return base.perimeter() * h + 2*base.area();
        }

     }
}
