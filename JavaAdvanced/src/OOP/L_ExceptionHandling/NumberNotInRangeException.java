package OOP.L_ExceptionHandling;

public class NumberNotInRangeException extends IllegalArgumentException {

    public NumberNotInRangeException(String message) {
        super(message);
    }

    public NumberNotInRangeException(String message, Exception cause) {
        super(message, cause);
    }
}
