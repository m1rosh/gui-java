package classes;

public class PrismTest {
    public static void main(String[] args) {
        Figure2D circle = new Circle(10);
        Figure2D triangle = new Triangle(3,4,5);

        Prism cylinder = new Prism(circle, 5);
        Prism triangularPrism = new Prism(triangle, 10);

        System.out.println("Площадь полной поверхности и объем цилиндра соответсвенно равны - " + cylinder.volume() + "; "+ cylinder.surfaceArea());
        System.out.println("Площадь полной поверхности и объем треугольной призмы соответсвенно равны - " + triangularPrism.volume() + "; " + triangularPrism.surfaceArea());
    }
}
