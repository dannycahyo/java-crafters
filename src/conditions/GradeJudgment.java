package conditions;

import java.util.Scanner;

public class GradeJudgment {
    public static void main(String[] args) {
        System.out.println("Enter your grade.");

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase();

        String judgment = "";

        switch (grade) {
            case "A":
                judgment = "Excellent";
                break;
            case "B":
                judgment = "Good";
                break;
            case "C":
                judgment = "Fair";
                break;
            case "D":
                judgment = "Poor";
                break;
            default:
                judgment = "Invalid grade";
                break;
        }

        scanner.close();

        System.out.println(judgment);
    }
}
