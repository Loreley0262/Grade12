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
        return "this is the 2string method hello";
    }

    //public abstract double annualSalary();
    //public abstract double monthlySalary();

}
