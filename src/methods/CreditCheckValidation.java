package methods;

import java.util.Scanner;

public class CreditCheckValidation {
    static Scanner scanner = new Scanner(System.in);
    static double minimumRequiredSalary = 30000;
    static int minimumRequiredCreditScore = 700;

    public static void main(String[] args) {
        double salary = getSalary();
        double creditScore = getCreditScore();

        scanner.close();

        boolean isQualified = isUserQualified(salary, creditScore);
        notifyUser(isQualified);
    }

    public static double getSalary() {
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    };

    public static double getCreditScore() {
        System.out.print("Enter your credit score: ");
        double creditScore = scanner.nextDouble();
        return creditScore;
    };

    public static boolean isUserQualified(double salary, double creditScore) {
        return salary >= minimumRequiredSalary && creditScore >= minimumRequiredCreditScore;
    }

    public static void notifyUser(boolean isQualified) {
        String message = isQualified ? "Congrats! You've been approved." : "Sorry, you've been declined.";
        System.out.println(message);
    }
}
