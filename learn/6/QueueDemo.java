import java.util.Arrays;

public class QueueDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(30);
        char[] charArr = {'a','b','c'};

        Queue fromCharArr = new Queue(charArr);
        
        
        // biq Q
        for(int i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        
        System.out.println("get bigQ:");
        System.out.println(bigQ.getQueue());
        
        System.out.println();
        
        System.out.println("get fromCharArr:");
        System.out.println(fromCharArr.getQueue());
        
        Queue fromQueue = new Queue(bigQ);

        System.out.println();

        System.out.println("get fromQueue:");
        System.out.println(fromQueue.getQueue());
        

    
    }
}

class Queue {
    char[] q;
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    Queue(Queue que) {
        putloc = que.putloc;
        getloc = que.getloc;
        this.q = new char[que.q.length];

        for(int i = getloc; i < putloc; i++) this.q[i] = que.q[i];
    }

    Queue(char[] arr) {
        putloc = 0;
        getloc = 0;
        q = new char[arr.length];

        for(int i = 0; i < arr.length; i++) put(arr[i]);
    }

    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }

    char[] getQueue() {
        return q;
    }
}



