public class UseMain {
    public static void main(String[] args) {
        
        Thread thrd = Thread.currentThread(); // get a reference to the main thread

        System.out.println("Main thread is called: " + thrd.getName());
        thrd.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main thread priority: " + thrd.getPriority());
        thrd.setName("Jonathan");
        System.out.println("Main thread is called: " + thrd.getName());


    }
}
