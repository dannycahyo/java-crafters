package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowingException {
    public static double calculatePayRate(double hoursWorked, double payRate) throws NegativeInputException {
        if (hoursWorked < 0 || payRate < 0) {
            throw new NegativeInputException();
        } else if (hoursWorked > 40) {
            throw new IllegalArgumentException("Overtime is not allowed");
        } else {
            return hoursWorked * payRate;
        }
    }

    public static void rethrowException() throws IOException {
        File file = new File("nonexistent.txt");
        file.createNewFile();
    }

    public static void rethrowMultipleException() throws IOException, InputMismatchException {
        File file = new File("nonexistent.txt");
        file.createNewFile();
    }

    public static void rethrowExceptions() throws Exception {
        File file = new File("nonexistent.txt");
        file.createNewFile();
        Scanner fileReader = new Scanner(file);
        fileReader.close();
    }
}
