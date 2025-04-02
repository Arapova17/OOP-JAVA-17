package exception_handling.exception;

public class MyException extends RuntimeException{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
