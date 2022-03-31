package classes;

public class Vector {
    private int n;
    private double[] coordinates;

    public Vector(double[] coordinates) {
        this.coordinates = coordinates;
        n = coordinates.length;
    }

    public void checkSize(Vector c){
        if (n != c.coordinates.length){
            throw new RuntimeException("Вектора должнеы быть одной размерности");
        }
    }

    public double scalarMult(Vector c) {
        double result = 0;
        for (int i = 0; i < n;i++){
            result += coordinates[i]*c.coordinates[i];
        }
        return result;
    }

    public Vector vectorAmount(Vector c) {
        double[] result = new double[n];
        for (int i = 0; i < n; i++){
            result[i] = coordinates[i] + c.coordinates[i];
        }
        return new Vector(result);
    }

    public Vector vectorSubstraction(Vector c) {
        double[] result = new double[n];
        for (int i = 0; i < n; i++){
            result[i] = coordinates[i] - c.coordinates[i];
        }
        return new Vector(result);
    }

    public double vectorLength(){
        double result = 0;
        for (int i = 0;i < n;i++){
            result += coordinates[i] * coordinates[i];
        }
        return Math.sqrt(result);
    }

    public double angleBetweenVectors(Vector c){
        return scalarMult(c)/vectorLength()/c.vectorLength();
    }

    public double square(Vector c){
        return Math.abs(vectorLength() * c.vectorLength() * Math.sin(Math.acos(angleBetweenVectors(c))));
    }

    public double vectorMult(Vector c){
        return vectorLength() * c.vectorLength() * Math.sin(Math.acos(angleBetweenVectors(c)));
    }

    public String toString(){
        String result = "(";
        //System.out.print("(");
        for (int i = 0; i < n; i++) {
            if (n - i == 1) {
                result += Double.toString(coordinates[i]);
                //System.out.print(coordinates[i]);
            } else {
                result += Double.toString(coordinates[i]);
                result += ", ";
                //System.out.print(coordinates[i] + ", ");
            }
        }
        result += ")";
        return result;
    }




}