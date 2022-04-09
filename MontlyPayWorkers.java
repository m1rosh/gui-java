package salary;

public class MontlyPayWorkers extends Salary{
    private double mountSalary;

    public MontlyPayWorkers(double mountSalary) {
        this.mountSalary = mountSalary;
    }

    @Override
    double calcuteSalary() {
        return mountSalary;
    }
}
