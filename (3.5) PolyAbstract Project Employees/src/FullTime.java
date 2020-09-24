public class FullTime extends  HourlyEmployee{
    boolean hasBenefits;

    FullTime(String name, double hoursPerWeek, double hourlyWage, int hireYear){
        this.name = name;
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyWage = hourlyWage;
        this.hireYear = hireYear;
    }
    @Override
    public boolean hasBenefits() {
        return false;
    }

    @Override
    public double annualSalary() {
        return 1.11;
    }

    @Override
    public double monthlySalary() {
        return 1.11;
    }
}
