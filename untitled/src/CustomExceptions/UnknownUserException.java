package CustomExceptions;

public class UnknownUserException extends Exception{
    public UnknownUserException(String message){
        super(message);
    }
}
