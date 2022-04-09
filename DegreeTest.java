package ex_3;

public class DegreeTest {
    public static void main(String[] args){
        double celDegree = 15;

        CelsiustoFahrenheit celsius1 = new CelsiustoFahrenheit();
        CelsiustoKelvin celsius2 = new CelsiustoKelvin();

        System.out.println(15 + "°C = " + celsius1.convert(celDegree) + "°F = " + celsius2.convert(celDegree) + "K"  );
        //System.out.println(celsius2.convert(celDegree));
    }
}
