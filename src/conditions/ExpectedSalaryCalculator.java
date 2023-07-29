package conditions;

import java.util.Scanner;

public class ExpectedSalaryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have an exact salary expectation?, Y/N");
        String hasExactSalaryExpectationString = scanner.next();

        boolean hasExactSalaryExpectation = hasExactSalaryExpectationString.equalsIgnoreCase("Y");

        if (hasExactSalaryExpectation) {
            System.out.println("Enter your exact salary expectation.");
            double exactSalaryExpectation = scanner.nextDouble();
            System.out.println(
                    "We already take note that your exact salary expectation is " + exactSalaryExpectation + "."
                            + "Please wait for our call.");
        } else {
            System.out.println("Do you have a minimum and maximum salary expectation?");
            String hasMinimumAndMaximumSalaryExpectationString = scanner.next();

            boolean hasMinimumAndMaximumSalaryExpectation = hasMinimumAndMaximumSalaryExpectationString
                    .equalsIgnoreCase("Y");

            if (!hasMinimumAndMaximumSalaryExpectation) {
                System.out.println("What's your previous salary?");
                double prevSalary = scanner.nextDouble();

                System.out.println("How many percent is your salary expectation from your previous salary?");
                double percentSalaryExpectation = scanner.nextDouble();

                double salaryExpectation = prevSalary * (1 + percentSalaryExpectation / 100);
                System.out.println(
                        "We already take note that your salary expectation is " + salaryExpectation + "."
                                + "Please wait for our call.");
            } else {
                System.out.println("Enter your minimum salary expectation.");
                double minimumSalaryExpectation = scanner.nextDouble();
                System.out.println("Enter your maximum salary expectation.");
                double maximumSalaryExpectation = scanner.nextDouble();
                System.out.println(
                        "We already take note that your salary expectation is between " + minimumSalaryExpectation
                                + " and "
                                + maximumSalaryExpectation + ". Please wait for our call.");
            }
        }
        scanner.close();
    }
}
