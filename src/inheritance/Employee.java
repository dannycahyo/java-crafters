package inheritance;

public class Employee extends Person {
    private String department;
    private double salary;

    public Employee(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
        System.out.println("Employee constructor called");
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Employee[" + super.toString() + ",department=" + department + ",salary=" + salary + "]";
    }

    public void print(String message) {
        System.out.println(message);
    }
}
