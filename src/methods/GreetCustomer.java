package methods;

import java.util.Scanner;

public class GreetCustomer {
    public static void main(String[] args) {
        String customerName = getCustomerName();
        greetCustomer(customerName);
    }

    public static String getCustomerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the customer name: ");
        String customerName = scanner.nextLine();
        scanner.close();
        return customerName;
    }

    public static void greetCustomer(String customerName) {
        System.out.println("Hello " + customerName + "!");
    }
}
