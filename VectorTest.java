package classes;
import java.util.Scanner;

public class VectorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector vector = new Vector(new double[]{1, 2, 3});
        Vector vector2 = new Vector(new double[]{5, 6, 7});
        //int n = vector.n;

        vector.checkSize(vector2);

        System.out.println("Нажмите \n" +
                "1 - скалярное произвдение векторов\n" + "2 - векторное произведение векторов\n" +
                "3 - сложение векторов\n4 - вычитание векторов\n5 - угол между векторами\n6 - длина вектора\n" +
                "7 - площадь параллелограмма, построенного на двух векторах\n" + "0 - завершить программу");
        int a = -1;
        while (true) {
            a = scanner.nextInt();


            if (a == 0) {
                break;
            }


            if (a == 1) {
                System.out.println("вектор " + vector.toString()+ " * на вектор "  + vector2.toString()+ " = " + vector.scalarMult(vector2));
            }

            if (a == 2){
                System.out.println("вектор " + vector.toString()+ " ❌ на вектор " + vector2.toString()+ " = " + String.format("%.3f",vector.vectorMult(vector2)));
            }

            if (a == 3) {
                System.out.println("вектор " + vector.toString()+ " + вектор " + vector2.toString()+ " = " + vector.vectorAmount(vector2).toString());
            }

            if (a == 4) {
                System.out.println("вектор " + vector.toString()+ " - вектор " + vector2.toString()+ " = " + vector.vectorSubstraction(vector2).toString());
            }

            if (a == 5) {
                String radAngle = String.format("%.3f",Math.acos(vector.angleBetweenVectors(vector2)));
                String degreeAngle = String.format("%.3f",Math.acos(vector.angleBetweenVectors(vector2)) * 180 /Math.PI);
                System.out.println(radAngle + " радиан (" + degreeAngle + " град.) - угол между векторами " + vector.toString() + " и " + vector2.toString());
            }

            if (a == 6) {
                System.out.println(String.format("%.3f",vector.vectorLength()) + " длина вектора " + vector.toString() +"\n"+
                        String.format("%.3f",vector2.vectorLength()) + " длина вектора " + vector2.toString());
            }

            if (a == 7){
                System.out.println("Площадь параллелограмма построенного на векторах " +vector.toString() + ", " + vector2.toString() + " = " + String.format("%.3f",vector.square(vector2)));
            }
            if (a > 7 | a < 0){
                System.out.println("❗ МОЖНО ВВОДИТЬ ТОЛЬКО ЦИФРЫ ОТ 0 ДО 7❗️");
            }
        }
    }
}
