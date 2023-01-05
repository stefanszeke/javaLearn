package queues;
import java.util.Arrays;
import interfacepack.ICharQ;
import exceptions.*;

public class DynamicQueue implements ICharQ {
    private char[] queue;
    private int getIndex, putIndex;

    public DynamicQueue(int size) {
        queue = new char[size];
        putIndex = getIndex = 0;
    }

    public void put(char newChar) {
        System.out.println(" * add: " + "["+ newChar +"] to " + this.getClass().getName().split("\\.")[1]);
        if(putIndex == queue.length) {
            queue = Arrays.copyOf(queue, queue.length*2);
            System.out.println("doubling size of Dynamic Queue to: " + getSize());
        }
        queue[putIndex++] = newChar;
    }

    public char get() throws QueueEmptyException{
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
