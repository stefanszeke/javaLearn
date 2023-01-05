
class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting."); // this is the main thread [start]

        // this loop is the main thread, it will run in parallel with the child thread
        try {
            MyThread mt = new MyThread("Child #1"); // create a thread and start it
            Counter.count(500, 10); // this is the main thread
            mt.thrd.join(); // wait for the child thread to finish
            MyThread2 mt2 = MyThread2.createAndStart("Child #2"); // create a thread and start it
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }




        System.out.println("Main thread ending."); // this is the main thread [end]
    }
}


class MyThread implements Runnable { // implements Runnable can be passed to Thread constructor
    Thread thrd;

    MyThread(String name) { // construct a new thread and start it
        thrd = new Thread(this, name); // construct a new thread
        thrd.start(); // start the thread
    }

    // Entry point of thread.
    public void run() { // this method is called when the thread starts
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400); // wait for 400 milliseconds
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class MyThread2 implements Runnable { // implements Runnable can be passed to Thread constructor
    Thread thrd;

    MyThread2(String name) {
        thrd = new Thread(this, name); // construct a new thread
    }

    public static MyThread2 createAndStart(String name) { // factory method
        MyThread2 myThrd = new MyThread2(name); // create a thread
        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // Entry point of thread.
    public void run() { // this method is called when the thread starts
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(500); // wait for 500 milliseconds
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class Counter {
    public static void count(int rounds, int wait) {
        for(int i=0; i<rounds; i++) {
            System.out.print("* ");
            try {
                Thread.sleep(wait); // sleep for 10 milliseconds
            }
                catch(Exception exc) {
                System.out.println(exc);
            }
        }
    }
}

