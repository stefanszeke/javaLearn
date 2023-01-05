package Queues;
import exceptions.*;
import interfacePack.*;

public class GenericQueue<T> implements IGenQueue<T> {
    private T[] queue;
    int getIndex; int putIndex;
    
    public GenericQueue (T[] array) {
        this.queue = array;
        getIndex = putIndex = 0;
    }

    public void put(T item) throws QueueFullException {
        if(putIndex == queue.length) { throw new QueueFullException(queue.length); }
        queue[putIndex++] = item;
    }

    public T get() throws QueueEmptyException {
        if(getIndex == putIndex) { throw new QueueEmptyException(); }
        return queue[getIndex++];
    }
}
    
