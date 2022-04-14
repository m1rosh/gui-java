package classes;
import java.util.Scanner;
public class DZ2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vehicle car = new Vehicle();
        System.out.println("Введите марку авто:");
        car.carName = scanner.nextLine();

        System.out.println("Введите среднюю скорость авто:");
        car.avgSpeed = scanner.nextDouble();

        System.out.println("Введите расход на 100 км:");
        car.fuelRate = scanner.nextDouble();

        System.out.println("Выберете тип кузова:");
        car.type = scanner.next();


        System.out.println("Дистанция поездки: ");
        double distance = scanner.nextDouble();


        System.out.println("Время преодоления заданной дистанции на " + car.carName + " составит " + String.format("%.2f",car.TimeForTrip(distance)) + "ч. - " + String.format("%.0f",car.TimeForTrip(distance) * 60) + " минут" +
                "\nДля этого потребуется " + car.FuelForTrip(distance)+ "л. топлива");

        System.out.println("\nПараметры:");
        car.ShowParametrs();


    }


}
