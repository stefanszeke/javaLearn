package classpack;
import interfacepack.*;

public class ByTwos implements ISeries{
    int start;
    int val;
    int prev;

    public ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        return val += 2;
    }

    public int getPrev() {
        return prev;
    }

    public void reset() {
        val = start;
        prev = start - 2;
    }

    public void setStart(int newStart) {
        this.start = newStart;
        val = newStart;
        prev = newStart - 2;
    }

    public void show() {
        System.out.println("[val]: " + val + " [start]: " + start);
    }
}
