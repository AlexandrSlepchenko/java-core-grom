package lesson27.exeption;

public class BadRequestException extends Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
