public class SalaryEmployee extends  Employee{
    int annualSalary;
    boolean hasBenefits;

    public SalaryEmployee(String name, int hireYear, int annualSalary){
        this.name = name;
        this.hireYear = hireYear;
        this.annualSalary = annualSalary;
    }
}
