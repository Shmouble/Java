package classes.partB.Exceptions;



public class NumberInputException extends Exception {
    public NumberInputException(){}
    public NumberInputException(String message, Throwable exception){
        super(message, exception);
    }
    public NumberInputException(String message){
        super(message);
    }
    public NumberInputException(Throwable exception){
        super(exception);
    }
}