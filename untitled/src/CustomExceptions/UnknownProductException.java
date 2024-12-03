package CustomExceptions;

public class UnknownProductException extends Exception{
    public UnknownProductException(String message){
        super(message);
    }
}
