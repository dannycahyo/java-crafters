package data_structure;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList<String> customers = new LinkedList<String>();
        customers.add("Raj");
        customers.add("John");
        customers.add("Smith");
        customers.add("Sam");
        customers.add("Raj");

        System.out.println(customers);

        var removedCustomer = customers.remove();
        System.out.println(removedCustomer);

        var firstCustomer = customers.peek();
        System.out.println(firstCustomer);

        System.out.println(customers);
    }
}
