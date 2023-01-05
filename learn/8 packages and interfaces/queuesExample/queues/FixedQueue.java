package queues;
import interfacepack.*;
import exceptions.*;

public class FixedQueue implements ICharQ {
    private char queue[]; // this array holds the queue
    private int putIndex, getIndex; // the put and get indices

    public FixedQueue(int size) {
        queue = new char[size]; // allocate memory for queue
        putIndex = getIndex = 0;
    }

    public void put(char newChar) throws QueueFullException{
        System.out.println(" * add: " + "["+ newChar +"] to " + this.getClass().getName().split("\\.")[1]) ;
            if(putIndex == queue.length) {
                throw new QueueFullException(queue.length);
            }
            queue[putIndex++] = newChar;
    }

    public char get() throws QueueEmptyException {
        System.out.println(" * get from " + this.getClass().getName().split("\\.")[1]);
        if(putIndex == getIndex) {
            throw new QueueEmptyException();
        }
        return queue[getIndex++];
    }

    public int getSize() {
        return queue.length;
    }
}
