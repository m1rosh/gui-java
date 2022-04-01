package classes;

public class Accumulator {
    public double volume;// в Ач
    public double currentVolume;// в процентах
    public double maxChargePower; // в Амперах
    public Accumulator(double volume, double currentVolume, double maxChargePower){
        this.volume = volume;
        this.currentVolume = currentVolume;
        this.maxChargePower = maxChargePower;
    }
    public double checkPercentage(){
        return currentVolume;
    }
    public void chargeIt(double time, double power){
            double A = volume * (currentVolume / 100);
            double newvolume = time * power;
            double res = newvolume + A;
            if (res >= volume) {
                currentVolume = 100;
                //return currentVolume;
            } else {
                currentVolume = (res / volume) * 100;
            }

            //return currentVolume;
        }

    public void DischargeAccumulator(double percents){
            currentVolume -= percents;

    }
    public String toString(){
        String result = "Текущие данные об аккумуляторе:\n" + volume + " максимальная емкость(Ач)\n" + currentVolume + "% текущая емкость\n" + maxChargePower + " максимальная сила тока при зарядке(Ампер)";
        return result;
    }
}
