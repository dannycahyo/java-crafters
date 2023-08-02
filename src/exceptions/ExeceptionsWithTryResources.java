package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeceptionsWithTryResources {
    public static void main(String[] args) {
        File file = new File("files/textAndNumbers.txt");

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException error) {
            System.out.println("There was something wrong with the file:" + error.getMessage());
        } catch (Exception error) {
            System.out.println("There was something wrong:" + error);
        }
        ;
    }
}
