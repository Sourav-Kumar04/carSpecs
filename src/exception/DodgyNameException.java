package exception;

public class DodgyNameException extends Exception {
    public DodgyNameException(String message) {
        super("DodgyNameException: " + message);
    }
}

