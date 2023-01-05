package queues;
import interfacepack.ICharQ;
import exceptions.*;

public class CircularQueue implements ICharQ {
    private char[] queue;
    private int putIndex, getIndex;

    public CircularQueue(int size) {
        queue = new char[size+1];
        putIndex = getIndex = 0;
    }

    public void put(char newChar) throws QueueFullException{
        System.out.println(" * add: " + "["+ newChar +"] to " + this.getClass().getName().split("\\.")[1]) ;
        if(putIndex+1 == getIndex | ( (putIndex == queue.length-1) & (getIndex == 0) ) ){
            throw new QueueFullException(queue.length-1);
        }   
        queue[putIndex++] = newChar;
        if(putIndex == queue.length) putIndex = 0;
     }

     public char get() throws QueueEmptyException{
        System.out.println(" * get from " + this.getClass().getName().split("\\.")[1]);
        if(putIndex == getIndex) {
            throw new QueueEmptyException();
        }
        char ch = queue[getIndex++];
        if(getIndex == queue.length) getIndex = 0;
        return ch;
     }

     public int getSize() {
        return queue.length-1;
    }
}

// size = 3
// p=0,g=0
// p A
 
// A
// p=1;g=0
// p B

// A B
// p=2;g=0
// p C


