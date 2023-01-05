package app;
import queues.*;
import services.*;

public class App {
    public static void main(String[] args) {

        FixedQueue fixedQ = new FixedQueue(3);
        CircularQueue circularQ = new CircularQueue(3);
        DynamicQueue dynamicQ = new DynamicQueue(3);

        // testing
        QueueTester.testQueue(fixedQ,4);
        
        QueueTester.testQueue(circularQ,4);
        try {
            circularQ.put('X');
            circularQ.put('Y');
            
        } catch (Exception e) {
            System.out.println(e);
        }
        QueueTester.testQueue(circularQ,4);

        QueueTester.testQueue(dynamicQ,8);
    }
}
