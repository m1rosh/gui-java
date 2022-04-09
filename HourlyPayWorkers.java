package salary;

public class HourlyPayWorkers extends Salary{
    private double hourRate;

    public HourlyPayWorkers(double hourRate) {
        this.hourRate = hourRate;
    }

    @Override
    double calcuteSalary() {
        return 20.8*8*hourRate;
    }
}
