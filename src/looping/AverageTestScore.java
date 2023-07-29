package looping;

import java.util.Scanner;

public class AverageTestScore {
    public static void main(String[] args) {

        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.print("Enter the score for Test #" + (j + 1) + " for student #" + (i + 1) + ": ");
                double score = scanner.nextDouble();

                while (score < 0 || score > 100) {
                    System.out.println("Invalid entry. Score must be between 0 and 100. Try again.");
                    score = scanner.nextDouble();
                }

                total += score;
            }

            double average = total / numberOfTests;
            System.out.println("The average score for student #" + (i + 1) + " is " + average);
        }

        scanner.close();
    }
}
