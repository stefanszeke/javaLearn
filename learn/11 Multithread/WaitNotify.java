// wait() and notify() are used to synchronize threads. They are used to control the flow of execution between threads.
// wait() causes the current thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify().
// notify() wakes up the first thread that called wait() on the same object.
//
// isAlive() returns true if the thread is still running.

// example of wait() and notify()

public class WaitNotify {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}

class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while(!valueSet)
            try {
                wait();
            }
            catch(InterruptedException exc) {
                System.out.println("InterruptedException caught");
            }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet)
            try {
                wait();
            }
            catch(InterruptedException exc) {
                System.out.println("InterruptedException caught");
            }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        for(int x = 0; x < 20; x++) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for(int x = 0; x < 20; x++) {
            q.get();
        }
    }
}


