import java.util.Arrays;

public class Sync2 {
    public static void main(String[] args) {
        int testArr[] = {1, 2, 3, 4, 5};

        MyThread mt1 = new MyThread("Child #1", testArr);
        MyThread mt2 = new MyThread("Child #2", testArr);

        mt2.setPriority(Thread.MIN_PRIORITY);

        try {
            mt1.join();
            mt2.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}

class SumArray {
    private int sum;

    int sumArray(int nums[]) { // method not synchronized, multiple threads can access at a time.
        sum = 0; // reset sum


        for(int i=0; i<nums.length; i++) {
            System.out.println("adding: " + nums[i]  + " to " + sum );
            sum += nums[i];

            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            }
            catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }

    static int sumArrayTest(int nums[]) {
        return Arrays.stream(nums).sum();
    }
}

class MyThread extends Thread {
    static SumArray summer = new SumArray();
    int[] arr;
    int answer;
    static String staticName = "Static Name";

    MyThread(String name, int nums[]) {
        super(name);
        arr = nums;
        start();
    }

    public void run() {
        int sum;

        System.out.println(this.getName() + " starting.");

        synchronized(summer) { // synchronized block, only one thread can access at a time. Delete the synchronized block to see the problem.
            answer = summer.sumArray(arr);
        }
        System.out.println("[Sum for " + this.getName() + " is " + answer + "] should be: " + SumArray.sumArrayTest(arr) + "\n");

        System.out.println(this.getName() + " terminating.");
    }
}