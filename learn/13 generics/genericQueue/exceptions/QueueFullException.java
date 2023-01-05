package exceptions;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "Queue is full. Maximum size is " + size;
    }
}
