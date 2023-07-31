package inheritance;

public class Person {
    private String name;
    private String address;

    public Person() {
        System.out.println("Person default constructor called");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Person constructor called");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }

    public void print() {
        System.out.println("Person print method called");
    }
}
