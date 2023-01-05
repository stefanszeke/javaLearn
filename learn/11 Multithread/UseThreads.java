
class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting."); // this is the main thread [start]

        // create a child thread:
        MyThread child1 = new MyThread("Child #1"); // First, construct a MyThread object.
        Thread child1Thread = new Thread(child1); // Next, construct a thread from that object.
        child1Thread.start(); // Finally, start execution of the thread.

        // this loop is the main thread, it will run in parallel with the child thread
        for(int i=0; i<300; i++) {
            System.out.print(".");
            try {
                Thread.sleep(10); // sleep for 10 milliseconds
            }
                catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending."); // this is the main thread [end]
    }
}


class MyThread implements Runnable { // implements Runnable can be passed to Thread constructor
    String thrdName; 

    MyThread(String name) {
        thrdName = name;
    }
    
    // Entry point of thread.
    public void run() { // this method is called when the thread starts
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400); // wait for 400 milliseconds
                System.out.println("In " + thrdName + ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}

