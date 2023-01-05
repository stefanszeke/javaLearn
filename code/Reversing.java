import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Reversing {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = {1,2,3,4,5,6};
    
            System.out.println("arr1:" + Arrays.toString(arr1));
            System.out.println("arr1 reverseLoop:" + Arrays.toString(Reversing.reverseLoop(arr1)));
            System.out.println("intArrayToString(arr1): " + Reversing.intArrayToString(arr1));
    
            System.out.println();

            System.out.println("arr2:" + Arrays.toString(arr2));
            System.out.println("arr2 reverseLoop2:" + Arrays.toString(Reversing.reverseLoop(arr2)));
    
            System.out.println();

            System.out.println("arr3:" + Arrays.toString(arr3));
            System.out.println("arr3 reverseCollections:" + Arrays.toString(Reversing.reverseCollections(arr3)));
        

    }
    
    static int[] reverseLoop(int[] array) {
        int[] reversed = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            reversed[array.length - 1 - i] = array[i];
        }
        return reversed;
    }

    static int[] reverseLoop2(int[] array) {
        int[] reversed = new int[array.length];
        for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return reversed;
    }

    static int[] reverseCollections(int[] array) {
        Integer[] result = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Collections.reverse(Arrays.asList(result));
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    static String intArrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        IntStream.of(array).forEach(n -> result.append(n));
        return result.toString();
    }
}
