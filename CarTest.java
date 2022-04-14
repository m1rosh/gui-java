package classes;
import java.util.Scanner;
public class CarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car("Mercdes", new R20());
        System.out.println(car1.toString());
        double[] existsWheels = new double[]{20, 25, 16};
        Wheels r25 = new R25();
        Wheels r20 = new R20();
        Wheels r16 = new R16();
        System.out.println("Нажмите:\n1 - рассчитать количество оборотв колеса на n км\n2 - сменить колесо\n3 - харакетристики машины\n0 - завершить программу");
        int a = -1;
        double n = 0;
        while (true) {
            a = scanner.nextInt();
            if (a == 0) {
                break;
            }
            if (a == 1) {
                System.out.println("Введите количество киллометров:");
                n = scanner.nextDouble();
                System.out.println(String.format("%.0f", car1.numberofTurns(n)));
            }
            if (a == 2) {
                System.out.println("Доступные радиусы колес: (в см)");
                for (int i = 0; i < existsWheels.length; i++){
                    System.out.println(existsWheels[i]);
                }
                System.out.println("На какое заменить?");
                n = scanner.nextDouble();
                if (n == car1.wheel.checkWheel()){
                    throw new RuntimeException("Колесо такого радиуса уже стоит на машине, перезапустите программу");
                }
                else {
                    if (n == 25){
                        car1.changeWheel(r25);
                        System.out.println(car1.toString());
                    }
                    if (n == 16){
                        car1.changeWheel(r16);
                        System.out.println(car1.toString());
                    }
                    if (n == 20){
                        car1.changeWheel(r20);
                        System.out.println(car1.toString());
                    }
                }
            }
            if (a == 3){
                System.out.println(car1.toString());
            }


        }

    }
}
