import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<PartTime> partTimeEmployeeList = new ArrayList<>();
        ArrayList<FullTime> fullTimeEmployeeList = new ArrayList<>();
        ArrayList<SalaryEmployee> salaryEmployeeList = new ArrayList<>();

        employeeList.add(new PartTime("PartOne", 2000, 15.5, 2000) {
            @Override
            public boolean hasBenefits() {
                return false;
            }

            @Override
            public double annualSalary() {
                return 0;
            }

            @Override
            public double monthlySalary() {
                return 0;
            }
        });
        employeeList.add(new PartTime("PartTwo", 2000, 15.5, 2000) {
            @Override
            public boolean hasBenefits() {
                return false;
            }

            @Override
            public double annualSalary() {
                return 0;
            }

            @Override
            public double monthlySalary() {
                return 0;
            }
        });
        employeeList.add(new FullTime("FullOne", 25.5, 14.60, 2000));
        employeeList.add(new FullTime("FullTwo", 25.5, 14.60, 2000));
        employeeList.add(new SalaryEmployee("SalOne", 2000, 5000));
        employeeList.add(new SalaryEmployee("SalTwo", 2000, 5000));

        for (Employee emp : employeeList){
            if(emp instanceof PartTime){
                partTimeEmployeeList.add((PartTime) emp);
            }
            else if(emp instanceof FullTime){
                fullTimeEmployeeList.add((FullTime) emp);
            }
            else if(emp instanceof SalaryEmployee){
                salaryEmployeeList.add((SalaryEmployee) emp);
            }
        }

        System.out.println("List of all Employees:\n" + employeeList);
        System.out.println("\nList of Part Time Employees:\n" + partTimeEmployeeList);
        System.out.println("\nList of Full Time Employees:\n" + fullTimeEmployeeList);
        System.out.println("\nList of Salary Employees:\n" + salaryEmployeeList);

    }
}
