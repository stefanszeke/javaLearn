
public class ExtendThread {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Child #1"); // create a thread and start it

        Counter.countWaitFor(10, mt);
    }
}

class MyThread extends Thread {
    MyThread(String name) {
        super(name); // call Thread constructor
        start(); // start the thread
    }
    
    // Entry point of thread.
    public void run() { // this method is called when the thread starts
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400); // wait for 400 milliseconds
                System.out.println("In " + this.getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}

class Counter {
    public static void count(int n, int w) {
        for(int i=0; i<n; i++) {
            System.out.print("* ");
            try {
                Thread.sleep(w); // sleep for 10 milliseconds
            }
                catch(Exception exc) {
                System.out.println(exc);
            }
        }
    }

    public static void countWaitFor(int waitTime, Thread thread) {
        /**
         * This method will wait for the thread to finish
         * before it continues to execute.
         * @param waitTime: the time between each print of string: ". "
         * @param thread: the thread to wait for
         * @return void
         */
        do {
            System.out.print(". ");
            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while(thread.isAlive());
    }
}