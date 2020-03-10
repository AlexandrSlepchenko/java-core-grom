package lesson20.exeptions;

public class LimitExceeded extends Exception {

    public LimitExceeded(String message) {
        super(message);
    }
}
