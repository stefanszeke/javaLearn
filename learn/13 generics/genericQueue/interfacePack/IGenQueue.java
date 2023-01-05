package interfacePack;
import exceptions.*;

public interface IGenQueue<T> {
    void put(T ch) throws QueueFullException;
    T get() throws QueueEmptyException;
}
