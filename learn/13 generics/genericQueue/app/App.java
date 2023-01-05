package app;
import Queues.*;
import exceptions.*;


public class App {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[5];
        GenericQueue<Integer> myIntQueue1 = new GenericQueue<Integer>(intArray);
    
        String[] strArray = new String[5];
        GenericQueue<String> myStrQueue1 = new GenericQueue<>(strArray);

        var strQueue2 = new GenericQueue<>(strArray);
        
        try {
            for(int i = 0; i < 6; i++) { myIntQueue1.put(i); }
        } catch (QueueFullException e) { e.printStackTrace(); }

        try {
            for(int i = 0; i < 6; i++) { System.out.println(myIntQueue1.get()); }
        } catch (QueueEmptyException e) { e.printStackTrace(); }
        
        try {
            for(int i = 0; i < 6; i++) { strQueue2.put(String.valueOf(i)); }
        } catch (QueueFullException e) { e.printStackTrace(); }

        try {
            for(int i = 0; i < 6; i++) { System.out.println(strQueue2.get()); }
        } catch (QueueEmptyException e) { e.printStackTrace(); }

    }


}
