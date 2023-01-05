package app;
import java.util.Arrays;

import classpack.*;


public class App {
    public static void main(String[] args) {
        ByTwos byTwoTest = new ByTwos();
        ByTrees byTreeTest = new ByTrees();
        
        byTwoTest.setStart(100);
        byTreeTest.setStart(100);
        for(int i = 0; i < 5; i++) {
            byTwoTest.getNext();
            byTreeTest.getNext();
        }

        byTwoTest.show();
        byTreeTest.show();
        
        System.out.println("ByTwos GetNextArray: " + Arrays.toString(byTwoTest.getNextArray(10)) );
        System.out.println("ByTrees GetNextArray: " + Arrays.toString(byTreeTest.getNextArray(10)) );
        
        System.out.println("ByTwos SkipGetNextArray: " + Arrays.toString(byTwoTest.skipAndGetNextArray(1000, 10)) );
        System.out.println("ByTrees SkipGetNextArray: " + Arrays.toString(byTreeTest.skipAndGetNextArray(1000, 10)) );

    }
}
