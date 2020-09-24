public abstract class Employee {
    String name;
    int hireYear;

    Employee(String name, int hireYear){
        this.name = name;
        this.hireYear = hireYear;
    }

    Employee(){

    }

    public String getName() {
        return name;
    }
    public int getHireYear() {
        return hireYear;
    }

    public String toString(){
        return "Employee Name: " + name + "\n Hire Year: " + hireYear + "\n";
    }

    public abstract double annualSalary();
    public abstract double monthlySalary();

}
