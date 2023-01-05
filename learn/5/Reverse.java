import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Reverse {
    public static void main(String[] args) {


        Integer[] intergerList = {1,2,3,4,5,6};
        System.out.println(Arrays.asList(intergerList));

        Collections.reverse(Arrays.asList(intergerList));
        System.out.println(Arrays.asList(intergerList));

        System.out.println();


        int[] intList = {10,20,50,100,5000};
        Integer[] intList2 = new Integer[intList.length];
        for(int i = 0; i < intList.length; i++) {
            intList2[i] = intList[i];
        }
        System.out.println(Arrays.asList(intList2));

        Integer[] intList3 = Arrays.stream(intList).boxed().toArray(Integer[]::new);

        Collections.reverse(Arrays.asList(intList2));
        System.out.println("using loop"+ Arrays.asList(intList2));
        
        Collections.reverse(Arrays.asList(intList3));   
        System.out.println("Using stream"+ Arrays.asList(intList3));


        
    }
}