package conditions;

import java.util.Scanner;

public class GradeJudgment_SwitchExpression {
    public static void main(String[] args) {
        System.out.println("Enter your grade.");

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase();

        String judgment = switch (grade) {
            case "A", "B" -> "Excellent";
            case "C" -> {
                yield "Fair";
            }
            case "D" -> "Poor";
            default -> "Invalid grade";
        };

        scanner.close();

        System.out.println(judgment);
    }
}
