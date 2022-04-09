package ex_3;

public class CelsiustoKelvin implements Converter {
    public CelsiustoKelvin() {
    }

    @Override
    public double convert(double celsius) {
        return celsius + 273;
    }
}
