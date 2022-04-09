package ex_3;

public class CelsiustoFahrenheit implements Converter {

    public CelsiustoFahrenheit() {
    }

    @Override
    public double convert(double celsius) {
        return 1.8*celsius + 32;
    }
}
