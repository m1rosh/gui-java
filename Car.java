package classes;

public class Car {
    String name;
    Wheels wheel;

    public Car(String name,Wheels wheel) {
        this.name = name;
        this.wheel = wheel;

    }

    public void changeWheel(Wheels wheel){
        this.wheel = wheel;
    }

    public double numberofTurns(double kilometrs){
        double length = 2 * Math.PI* (wheel.radius/100);
        return kilometrs*1000/length;

    }
    public String toString(){
        String result = "Авто:\n" + name + '\n';
        if (wheel instanceof R20){
            result += "Радиус колеса машины - 20см";
        }
        if (wheel instanceof R25){
            result += "Радиус колеса машины - 25см";
        }
        if (wheel instanceof R16){
            result += "Радиус колеса машины - 16см";
        }
        return result;
    }





}
