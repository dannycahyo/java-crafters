package looping;

import java.util.Scanner;

public class MiniCashier {
    public static void main(String[] args) {
        System.out.println("Welcome to Mini Cashier!");
        System.out.println("Enter the number of products you want to scan: ");

        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter the price of product " + (i + 1) + ": ");
            double price = scanner.nextDouble();

            total += price;
        }

        scanner.close();
        System.out.println("Total: " + total);
    }
}