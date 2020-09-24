import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HourlyEmployee> partTimeEmployeeList = new ArrayList<>();
        ArrayList<SalaryEmployee> salaryEmployeeList = new ArrayList<>();

        HourlyEmployee bob = new HourlyEmployee("EMPBob", 2000, 15.5, 14.60) {
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
        };
        PartTime joe = new PartTime("PTJoe", 25.5, 14.60, 2000);
        SalaryEmployee sal = new SalaryEmployee("Sal", 2000, 5000);

        partTimeEmployeeList.add(bob);
        partTimeEmployeeList.add(joe);

        salaryEmployeeList.add(sal);

        System.out.println(salaryEmployeeList + "\n" + partTimeEmployeeList);

    }
}
