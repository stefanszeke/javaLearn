import java.util.Arrays;

public class QueueDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(30);
        Queue smallQ = new Queue(4);

        // biq Q
        for(int i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        // for(int i = 0; i < 30; i++) {
        //     char ch = bigQ.get();
        //         System.out.print(ch);
        // }
        System.out.println("forEach bigQ:");
        for(char character: bigQ.getQueue()) {
            System.out.print(character);
        }
        System.out.println();
        System.out.println("get bigQ:");
        System.out.println(bigQ.getQueue());

        System.out.println();
        System.out.println();
        
        // small Q
        for(int i = 0; i < 5; i++) {
            smallQ.put((char) ('A' + i));
        }
        for(int i = 0; i < 5; i++) {
            char ch = smallQ.get();
                System.out.print(ch);
        }
        
    }
}

class Queue {
    char[] q;
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
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



