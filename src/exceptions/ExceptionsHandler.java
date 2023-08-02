package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsHandler {
    public static void main(String[] args) {
        // Unchecked Exceptions
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }

        // Checked Exceptions
        File file = new File("files/textAndNumbers.txt");
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException error) {
            System.out.println("There was something wrong with the file:" + error.getMessage());
        } catch (InputMismatchException error) {
            System.out.println("There was something wrong when reading the file:" + error);
        } catch (Exception error) {
            System.out.println("There was something wrong:" + error);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
