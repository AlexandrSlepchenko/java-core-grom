package lesson27.exeption;

public class InternalServerException extends Exception {
    public InternalServerException(String message) {
        super(message);
    }
}
