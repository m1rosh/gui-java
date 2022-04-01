package classes;
import java.util.Scanner;
public class AccumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Accumulator accum1 = new Accumulator(1000,50,6);
        int a = -1;
        System.out.println("Нажмите:\n1 - показать характеристики аккумулятора\n2 - зарядить аккумулятор\n3 - разрядить аккумулятор\n0 - завершить программу");
        while (true) {
            a = scanner.nextInt();
            if (a == 1) {
                System.out.println(accum1.toString());
            }
            if (a == 2) {
                System.out.println("Введите время зарядки (ТОЛЬКО В СЕКУНДАХ)");
                double sec = scanner.nextDouble();
                System.out.println("Введите силу тока(в Амперах)");
                double p = scanner.nextDouble();
                if (p <= accum1.maxChargePower){
                    accum1.chargeIt(sec, p);
                }
                else{
                    continue;
                }


            }
            if (a == 3) {
                System.out.println("На какое количество процентов разрядить?");
                double pr = scanner.nextDouble();
                if (pr <= accum1.currentVolume){
                    accum1.DischargeAccumulator(pr);
                }
                else {
                    System.out.println("Невозможно, введите меньшее число");
                    continue;
                }

            }
            if (a == 0){
                break;
            }
        }
    }
}
