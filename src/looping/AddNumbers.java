package looping;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        boolean again = true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("Enter a second number: ");
            int secondNum = scanner.nextInt();

            System.out.println("Sum: " + (firstNum + secondNum));

            System.out.print("Do you want to add more numbers? (y/n) ");
            String answer = scanner.next().toLowerCase();

            if (answer.equals("n")) {
                again = false;
                scanner.close();
            }
        } while (again);
    }
}
