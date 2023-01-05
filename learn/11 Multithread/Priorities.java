class Priorities {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");
        PriorityAlt mt3 = new PriorityAlt("Max Priority");
        PriorityAlt mt4 = new PriorityAlt("Min Priority");

        // set the priorities
        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);
        mt3.setPriority(Thread.MAX_PRIORITY);
        mt4.setPriority(Thread.MIN_PRIORITY);

        // start the threads
        // mt1.thrd.start();
        // mt2.thrd.start();
        mt3.start();
        mt4.start();


        try { // wait for threads to end
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.join();
            mt4.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

        // display results after threads have ended
        System.out.println("\nHigh priority thread counted to " + mt1.count);
        System.out.println("Low priority thread counted to " + mt2.count);
        System.out.println("Max priority thread counted to " + mt3.count);
        System.out.println("Min priority thread counted to " + mt4.count);
    }
}

class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    // Construct a new thread.
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    // Begin execution of new thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;

            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 10000000);
        stop = true;

        System.out.println(" " + thrd.getName() + " terminating.");
    }
}

class PriorityAlt extends Thread {
    int count;

    static boolean stop = false;
    static String currentName;


    // Construct a new thread.
    PriorityAlt(String name) {
        super(name);
        currentName = name;
   }

    // Begin execution of new thread.
    public void run() {
        System.out.println(getName() + " starting.");

        do {
            count++;
            if(currentName.compareTo(getName()) != 0) {
                System.out.println("In " + getName());
            }
        } while(stop == false && count < 10000000);

        stop = true;

        System.out.println(getName() + " terminating.");
    }
}