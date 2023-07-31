package inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
        Person person = new Person("John", "123 Main St.");
        System.out.println(person.toString());

        Employee employee = new Employee("Jane", "456 Main St.", "HR", 50000);
        System.out.println(employee.toString());
        employee.print("Hello World!");
    }
}
