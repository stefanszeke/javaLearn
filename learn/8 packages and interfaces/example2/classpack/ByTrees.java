package classpack;
import interfacepack.*;

public class ByTrees implements ISeries  {
    int start;
    int val;
    int prev;


    public ByTrees() {
        start = 0;
        val = 0;
        prev = -3;
    }

    public int getNext() {
        prev = val;
        return val += 3;
    }

    public int getPrev() {
        return prev;
    }

    public void reset() {
        val = start;
        prev = start - 3;
    }

    public void setStart(int newStart) {
        this.start = newStart;
        val = newStart;
        prev = newStart - 3;
    }

    public void show() {
        System.out.println("[val]: " + val + " [start]: " + start);
    }
}
