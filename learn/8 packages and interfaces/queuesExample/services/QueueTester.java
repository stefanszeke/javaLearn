package services;
import exceptions.*;
import interfacepack.*;

public class QueueTester {
    public static void testQueue(ICharQ queue,int itemsToAdd) {
        System.out.println("Testing: " + queue.getClass().getName().split("\\.")[1]+ "[" + queue.getSize() + "] adding: " + itemsToAdd + " items");
        
        System.out.println("Adding items: ");
        for(int i = 0; i < itemsToAdd; i++) { 
            try {
                queue.put((char)(i+65));
            } catch (QueueFullException e) {
                System.out.println(e);
            } 
        }

        System.out.println("Getting items: ");
        for(int i = 0; i < queue.getSize()+1; i++) { 
            try {
                System.out.println(" -> " + queue.get()); 
            } catch (QueueEmptyException e) {
                System.out.println(e);
            }
        }

        System.out.println();
        System.out.println();
    }
}
