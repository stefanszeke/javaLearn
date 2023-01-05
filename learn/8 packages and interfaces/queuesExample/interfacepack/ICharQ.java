package interfacepack;

import exceptions.*;

public interface ICharQ {
    void put(char ch) throws QueueFullException; // put a character into the queue
    char get() throws QueueEmptyException; // get a character from the queue
    int getSize(); // get size of the queue
}
