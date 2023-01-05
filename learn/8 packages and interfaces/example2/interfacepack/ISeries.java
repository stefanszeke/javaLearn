package interfacepack;

public interface ISeries {
    int getNext();
    default int[] getNextArray(int n) {
        return getArray(n);
    }
    void reset();
    void setStart(int x);
    private int[] getArray(int n) {
        int[] vals = new int[n];
        for(int i = 0; i < n; i++) { vals[i] = getNext(); }
        return vals;
    }
    default int[] skipAndGetNextArray(int skip, int n) {
        getArray(skip);
        return getArray(n);
    }
}
