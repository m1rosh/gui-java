package classes;

public class Vehicle {
    public String carName;
    public double avgSpeed;
    public double fuelRate;
    public String type;


    public  boolean IsEnteredInfoCorrect(){
        return avgSpeed * fuelRate > 0;
    }
    public double TimeForTrip(double distance){
        if (!IsEnteredInfoCorrect()){
            throw new RuntimeException("Введите корректные данные");
        }
        return distance/avgSpeed;
    }
    public double FuelForTrip(double distance){
        if (!IsEnteredInfoCorrect()){
            throw new RuntimeException("Введите корректные данные");
        }
        return fuelRate*(distance/100);
    }
    public void ShowParametrs(){
        System.out.println("Название авто - " + carName);
        System.out.println("Средння скорость - " + avgSpeed);
        System.out.println("Расход топлива на 100км - " + fuelRate);
        System.out.println("Тип кузова - " + type);
    }

}
