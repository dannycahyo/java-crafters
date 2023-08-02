package exceptions;

public class NegativeInputException extends Exception {
    public NegativeInputException() {
        this("The number must be greater than or equal to zero");
    }

    public NegativeInputException(String message) {
        super(message);
    }
}
