package exceptions;

public class QueueEmptyException extends Exception{
    
    public String toString() {
        return "[exp:] Queue is empty.";
    }
}
