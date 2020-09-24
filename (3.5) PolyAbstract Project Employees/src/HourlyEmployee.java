public abstract class HourlyEmployee extends  Employee{
    double hoursPerWeek;
    double hourlyWage;
    boolean hasBenefits;

    public HourlyEmployee(String name, int hireYear, double hoursPerWeek, double hourlyWage){
        this.name = name;
        this.hireYear = hireYear;
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(){

    }

    public abstract boolean hasBenefits();
}
